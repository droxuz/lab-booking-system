package com.reservation_system.services;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Equipment.EquipmentStatus;
import com.reservation_system.model.Reservation;
import com.reservation_system.model.User;
import com.reservation_system.patterns.observer.EquipmentRegistry;
import com.reservation_system.patterns.strategy.*;
import com.reservation_system.repository.UserRepository;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ReservationService {

    private static final String FILE_PATH = "data/reservations.csv";
    private static final String HEADER    = "id,userId,equipmentId,startTime,hours,hourlyRate,certificationId,paymentMethod,status";

    private final List<Reservation> reservations = new ArrayList<>();
    private final UserRepository userRepository;
    private final EquipmentRegistry equipmentRegistry;

    public ReservationService(UserRepository userRepository, EquipmentRegistry equipmentRegistry) {
        this.userRepository    = userRepository;
        this.equipmentRegistry = equipmentRegistry;
        ensureFileExists();
    }

    private void ensureFileExists() {
        try {
            Path path = Paths.get(FILE_PATH);
            if (Files.notExists(path.getParent())) Files.createDirectories(path.getParent());
            if (Files.notExists(path)) {
                Files.createFile(path);
                try (BufferedWriter w = Files.newBufferedWriter(path)) {
                    w.write(HEADER); w.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to initialise reservations.csv", e);
        }
    }

    public void loadAll() {
        try (BufferedReader r = Files.newBufferedReader(Paths.get(FILE_PATH))) {
            String line = r.readLine();
            while ((line = r.readLine()) != null) {
                String[] p = line.split(",", -1);
                if (p.length < 9) continue;
                try {
                    UUID resId          = UUID.fromString(p[0].trim());
                    int userId          = Integer.parseInt(p[1].trim());
                    UUID equipmentId    = UUID.fromString(p[2].trim());
                    LocalDateTime start = LocalDateTime.parse(p[3].trim());
                    int hours           = Integer.parseInt(p[4].trim());
                    double hourlyRate   = Double.parseDouble(p[5].trim());
                    String certId       = p[6].trim();
                    String payMethod    = p[7].trim();
                    Reservation.Status status = Reservation.Status.valueOf(p[8].trim());

                    User user = userRepository.getAllUsers().stream()
                            .filter(u -> u.getID() == userId).findFirst().orElse(null);
                    Equipment equipment = equipmentRegistry.getAll().stream()
                            .filter(e -> e.getEquipmentId().equals(equipmentId)).findFirst().orElse(null);

                    if (user == null || equipment == null) continue;

                    PaymentStrategy strategy = buildStrategyFromName(payMethod);
                    Reservation res = new Reservation(resId, user, equipment, start,
                            hours, hourlyRate, certId, strategy);
                    res.setStatus(status);
                    reservations.add(res);
                } catch (Exception ignored) {}
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to read reservations.csv", e);
        }
    }

    private void saveAll() {
        try (BufferedWriter w = Files.newBufferedWriter(Paths.get(FILE_PATH))) {
            w.write(HEADER); w.newLine();
            for (Reservation r : reservations) {
                w.write(String.join(",",
                        r.getId().toString(),
                        String.valueOf(r.getUser().getID()),
                        r.getEquipment().getEquipmentId().toString(),
                        r.getStartTime().toString(),
                        String.valueOf(r.getHours()),
                        String.valueOf(r.getHourlyRate()),
                        r.getCertificationId(),
                        r.getPaymentStrategy().getMethodName(),
                        r.getStatus().name()));
                w.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to save reservations.csv", e);
        }
    }

    private PaymentStrategy buildStrategyFromName(String name) {
        switch (name) {
            case "Debit Card":           return new DebitCardPayment();
            case "Institutional Account": return new InstitutionalPayment();
            case "Research Grant":       return new GrantPayment();
            default:                     return new CreditCardPayment();
        }
    }

    public double getHourlyRate(User user) {
        switch (user.getUserType().toLowerCase()) {
            case "student":    return 10.0;
            case "faculty":    return 15.0;
            case "researcher": return 20.0;
            case "guest":      return 30.0;
            default:           return 15.0;
        }
    }

    public Reservation book(User user, Equipment equipment,
                            LocalDateTime startTime, int hours,
                            String certificationId, PaymentStrategy paymentStrategy) {
        if (equipment.getEquipmentStatus() == EquipmentStatus.DISABLED
         || equipment.getEquipmentStatus() == EquipmentStatus.MAINTENANCE) {
            throw new IllegalStateException("Equipment is not available for booking.");
        }
        if (hours < 1) throw new IllegalArgumentException("Must book at least 1 hour.");
        if (certificationId == null || certificationId.isBlank())
            throw new IllegalArgumentException("Student/Staff ID or certification number is required.");
        if (startTime.isBefore(LocalDateTime.now()))
            throw new IllegalArgumentException("Start time must be in the future.");
        if (hasConflict(equipment, startTime, startTime.plusHours(hours), null))
            throw new IllegalStateException("Equipment is already booked during that time.");

        Reservation r = new Reservation(user, equipment, startTime, hours,
                getHourlyRate(user), certificationId, paymentStrategy);
        paymentStrategy.pay(r.getDeposit());
        reservations.add(r);
        saveAll();
        return r;
    }

    public void modify(Reservation r, LocalDateTime newStartTime, int newHours) {
        if (r.getStatus() != Reservation.Status.PENDING)
            throw new IllegalStateException("Only pending reservations can be modified.");
        if (newStartTime.isBefore(LocalDateTime.now()))
            throw new IllegalArgumentException("Start time must be in the future.");
        if (newHours < 1) throw new IllegalArgumentException("Must book at least 1 hour.");
        if (hasConflict(r.getEquipment(), newStartTime, newStartTime.plusHours(newHours), r))
            throw new IllegalStateException("Equipment is already booked during that time.");
        r.setStartTime(newStartTime);
        r.setHours(newHours);
        saveAll();
    }

    public void extend(Reservation r, int extraHours) {
        if (r.getStatus() != Reservation.Status.ACTIVE)
            throw new IllegalStateException("Only active reservations can be extended.");
        if (extraHours < 1) throw new IllegalArgumentException("Must extend by at least 1 hour.");
        if (hasConflict(r.getEquipment(), r.getEndTime(), r.getEndTime().plusHours(extraHours), r))
            throw new IllegalStateException("Equipment is already booked during the extension period.");
        r.getPaymentStrategy().pay(r.getHourlyRate() * extraHours);
        r.addHours(extraHours);
        saveAll();
    }

    public void cancel(Reservation r) {
        if (r.getStatus() != Reservation.Status.PENDING)
            throw new IllegalStateException("Only pending reservations can be cancelled.");
        r.setStatus(Reservation.Status.CANCELLED);
        saveAll();
    }

    public void payBalance(Reservation r) {
        if (r.getStatus() != Reservation.Status.PENDING)
            throw new IllegalStateException("Reservation is not pending.");
        double balance = r.getTotalCost() - r.getDeposit();
        if (balance > 0) r.getPaymentStrategy().pay(balance);
        r.setStatus(Reservation.Status.ACTIVE);
        saveAll();
    }

    public List<Reservation> getForUser(User user) {
        return reservations.stream()
                .filter(r -> r.getUser().getID() == user.getID())
                .collect(Collectors.toList());
    }

    private boolean hasConflict(Equipment equipment, LocalDateTime start,
                                 LocalDateTime end, Reservation exclude) {
        return reservations.stream()
                .filter(r -> r != exclude)
                .filter(r -> r.getEquipment().getEquipmentId().equals(equipment.getEquipmentId()))
                .filter(r -> r.getStatus() == Reservation.Status.PENDING
                          || r.getStatus() == Reservation.Status.ACTIVE)
                .anyMatch(r -> start.isBefore(r.getEndTime()) && end.isAfter(r.getStartTime()));
    }
}