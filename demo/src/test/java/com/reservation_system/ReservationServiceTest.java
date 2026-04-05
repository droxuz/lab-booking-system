package com.reservation_system;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.model.Reservation;
import com.reservation_system.model.Student;
import com.reservation_system.model.Faculty;
import com.reservation_system.patterns.observer.EquipmentRegistry;
import com.reservation_system.patterns.strategy.CreditCardPayment;
import com.reservation_system.repository.UserRepository;
import com.reservation_system.services.ReservationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ReservationServiceTest {

    @TempDir
    Path tempDir;

    private ReservationService service;
    private Student student;
    private Faculty faculty;
    private Equipment equipment;

    @BeforeEach
    void setUp() throws IOException {
        // wipe the reservations CSV before each test so runs don't bleed into each other
        Files.deleteIfExists(Paths.get("demo/data/reservations.csv"));

        String tempUsers = tempDir.resolve("demo/data/users.csv").toString();
        UserRepository userRepo = new UserRepository(tempUsers);

        service = new ReservationService(userRepo, new EquipmentRegistry());

        student   = new Student(1, "Alice", "alice@uni.com", "pass123", true);
        faculty   = new Faculty(2, "Bob",   "bob@uni.com",   "pass456", true);
        equipment = new Equipment(UUID.randomUUID(), EquipmentType.POWER_SUPPLY, "Power Supply", LabLocation.LAS1001);
    }

    // --- hourly rate ---

    @Test
    void studentRateIsTen() {
        assertEquals(10.0, service.getHourlyRate(student));
    }

    @Test
    void facultyRateIsFifteen() {
        assertEquals(15.0, service.getHourlyRate(faculty));
    }

    // --- booking validation ---

    @Test
    void cannotBookInThePast() {
        assertThrows(IllegalArgumentException.class, () ->
                service.book(student, equipment, LocalDateTime.now().minusHours(1), 2, "CERT-001", new CreditCardPayment()));
    }

    @Test
    void cannotBookZeroHours() {
        assertThrows(IllegalArgumentException.class, () ->
                service.book(student, equipment, LocalDateTime.now().plusDays(1), 0, "CERT-001", new CreditCardPayment()));
    }

    @Test
    void certificationIdCannotBeBlank() {
        assertThrows(IllegalArgumentException.class, () ->
                service.book(student, equipment, LocalDateTime.now().plusDays(1), 2, "  ", new CreditCardPayment()));
    }

    @Test
    void certificationIdCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () ->
                service.book(student, equipment, LocalDateTime.now().plusDays(1), 2, null, new CreditCardPayment()));
    }

    @Test
    void successfulBookingReturnsPendingReservation() {
        Reservation res = service.book(student, equipment, LocalDateTime.now().plusDays(1), 2, "CERT-001", new CreditCardPayment());
        assertEquals(Reservation.Status.PENDING, res.getStatus());
    }

    @Test
    void bookingWithOverlapThrows() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        service.book(student, equipment, start, 4, "CERT-001", new CreditCardPayment());

        assertThrows(IllegalStateException.class, () ->
                service.book(faculty, equipment, start.plusHours(2), 2, "CERT-002", new CreditCardPayment()));
    }

    @Test
    void nonOverlappingBookingsOnSameEquipmentAreAllowed() {
        LocalDateTime first = LocalDateTime.now().plusDays(1);
        service.book(student, equipment, first, 2, "CERT-001", new CreditCardPayment());
        assertDoesNotThrow(() ->
                service.book(faculty, equipment, first.plusHours(4), 2, "CERT-002", new CreditCardPayment()));
    }


    @Test
    void modifyUpdatesTimes() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Reservation res = service.book(student, equipment, start, 2, "CERT-001", new CreditCardPayment());
        LocalDateTime newStart = start.plusDays(1);

        service.modify(res, newStart, 3);

        assertEquals(newStart, res.getStartTime());
        assertEquals(3, res.getHours());
    }

    @Test
    void cannotModifyActiveReservation() {
        LocalDateTime start = LocalDateTime.now().plusDays(1);
        Reservation res = service.book(student, equipment, start, 2, "CERT-001", new CreditCardPayment());
        service.payBalance(res);

        assertThrows(IllegalStateException.class, () ->
                service.modify(res, start.plusDays(2), 2));
    }

    // --- cancel ---

    @Test
    void cancelSetsCancelledStatus() {
        Reservation res = service.book(student, equipment, LocalDateTime.now().plusDays(1), 2, "CERT-001", new CreditCardPayment());
        service.cancel(res);
        assertEquals(Reservation.Status.CANCELLED, res.getStatus());
    }

    @Test
    void cannotCancelActiveReservation() {
        Reservation res = service.book(student, equipment, LocalDateTime.now().plusDays(1), 2, "CERT-001", new CreditCardPayment());
        service.payBalance(res);
        assertThrows(IllegalStateException.class, () -> service.cancel(res));
    }

    // --- pay balance ---

    @Test
    void payBalanceSetsStatusToActive() {
        Reservation res = service.book(student, equipment, LocalDateTime.now().plusDays(1), 3, "CERT-001", new CreditCardPayment());
        service.payBalance(res);
        assertEquals(Reservation.Status.ACTIVE, res.getStatus());
    }

    @Test
    void payBalanceOnNonPendingThrows() {
        Reservation res = service.book(student, equipment, LocalDateTime.now().plusDays(1), 2, "CERT-001", new CreditCardPayment());
        service.payBalance(res);
        assertThrows(IllegalStateException.class, () -> service.payBalance(res));
    }

    // --- extend ---

    @Test
    void extendAddsHoursToActiveReservation() {
        Reservation res = service.book(student, equipment, LocalDateTime.now().plusDays(1), 2, "CERT-001", new CreditCardPayment());
        service.payBalance(res);
        service.extend(res, 1);
        assertEquals(3, res.getHours());
    }

    @Test
    void cannotExtendPendingReservation() {
        Reservation res = service.book(student, equipment, LocalDateTime.now().plusDays(1), 2, "CERT-001", new CreditCardPayment());
        assertThrows(IllegalStateException.class, () -> service.extend(res, 1));
    }

    // --- getForUser ---

    @Test
    void getForUserOnlyReturnsTheirReservations() {
        Equipment eq2 = new Equipment(UUID.randomUUID(), EquipmentType.OSCILLOSCOPE, "Oscilloscope", LabLocation.LAS1001);
        service.book(student, equipment, LocalDateTime.now().plusDays(1), 2, "CERT-001", new CreditCardPayment());
        service.book(faculty, eq2,       LocalDateTime.now().plusDays(3), 2, "CERT-002", new CreditCardPayment());

        List<Reservation> studentRes = service.getForUser(student);
        assertEquals(1, studentRes.size());
        assertEquals(student, studentRes.get(0).getUser());
    }

    @Test
    void getForUserReturnsEmptyWhenNoneBooked() {
        assertTrue(service.getForUser(student).isEmpty());
    }
}