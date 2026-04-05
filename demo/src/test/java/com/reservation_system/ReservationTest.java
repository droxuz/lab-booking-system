package com.reservation_system;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentType;
import com.reservation_system.Equipment.LabLocation;
import com.reservation_system.model.Reservation;
import com.reservation_system.model.Student;
import com.reservation_system.model.Faculty;
import com.reservation_system.patterns.strategy.CreditCardPayment;
import com.reservation_system.patterns.strategy.DebitCardPayment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    private Student student;
    private Equipment equipment;
    private LocalDateTime startTime;
    private Reservation reservation;

    @BeforeEach
    void setUp() {
        student   = new Student(1, "Alice", "alice@uni.com", "pass123", true);
        equipment = new Equipment(UUID.randomUUID(), EquipmentType.OSCILLOSCOPE, "Electron Microscope", LabLocation.BERGERON200);
        startTime = LocalDateTime.now().plusDays(1);
        reservation = new Reservation(student, equipment, startTime, 3, 10.0, "CERT-001", new CreditCardPayment());
    }

    @Test
    void totalCostIsHourlyRateTimesHours() {
        assertEquals(30.0, reservation.getTotalCost());
    }

    @Test
    void depositEqualsOneHourOfRate() {
        assertEquals(10.0, reservation.getDeposit());
    }

    @Test
    void endTimeIsStartPlusHours() {
        assertEquals(startTime.plusHours(3), reservation.getEndTime());
    }

    @Test
    void defaultStatusIsPending() {
        assertEquals(Reservation.Status.PENDING, reservation.getStatus());
    }

    @Test
    void canSetStatusToActive() {
        reservation.setStatus(Reservation.Status.ACTIVE);
        assertEquals(Reservation.Status.ACTIVE, reservation.getStatus());
    }

    @Test
    void canSetStatusToCancelled() {
        reservation.setStatus(Reservation.Status.CANCELLED);
        assertEquals(Reservation.Status.CANCELLED, reservation.getStatus());
    }

    @Test
    void setHoursUpdatesTotalCost() {
        reservation.setHours(5);
        assertEquals(50.0, reservation.getTotalCost());
        assertEquals(5, reservation.getHours());
    }

    @Test
    void addHoursIncreasesHoursAndCost() {
        reservation.addHours(2);
        assertEquals(5, reservation.getHours());
        assertEquals(50.0, reservation.getTotalCost());
    }

    @Test
    void setStartTimeUpdatesStartTime() {
        LocalDateTime newStart = startTime.plusHours(2);
        reservation.setStartTime(newStart);
        assertEquals(newStart, reservation.getStartTime());
    }

    @Test
    void reservationHoldsCorrectUser() {
        assertEquals(student, reservation.getUser());
    }

    @Test
    void reservationHoldsCorrectEquipment() {
        assertEquals(equipment, reservation.getEquipment());
    }

    @Test
    void certificationIdStoredCorrectly() {
        assertEquals("CERT-001", reservation.getCertificationId());
    }

    @Test
    void customIdConstructorUsesProvidedId() {
        UUID id = UUID.randomUUID();
        Faculty faculty = new Faculty(2, "Bob", "bob@uni.com", "pass456", true);
        Reservation res = new Reservation(id, faculty, equipment, startTime, 2, 15.0, "CERT-002", new DebitCardPayment());
        assertEquals(id, res.getId());
    }

    @Test
    void toStringContainsEquipmentDescription() {
        assertTrue(reservation.toString().contains("Electron Microscope"));
    }

    @Test
    void toStringContainsStatus() {
        assertTrue(reservation.toString().contains("PENDING"));
    }
}