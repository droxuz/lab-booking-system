package com.reservation_system.services;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.model.Reservation;
import com.reservation_system.model.User;
import com.reservation_system.patterns.strategy.PaymentStrategy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReservationService {

    private final List<Reservation> reservations = new ArrayList<>();

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
        if (!equipment.isAvailable()) {
            throw new IllegalStateException("Equipment is not available.");
        }
        if (hours < 1) {
            throw new IllegalArgumentException("Must book at least 1 hour.");
        }
        if (certificationId == null || certificationId.isBlank()) {
            throw new IllegalArgumentException("Student/Staff ID or certification number is required.");
        }
        if (startTime.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Start time must be in the future.");
        }
        LocalDateTime endTime = startTime.plusHours(hours);
        if (hasConflict(equipment, startTime, endTime, null)) {
            throw new IllegalStateException("Equipment is already booked during that time.");
        }
        equipment.reserve();
        Reservation r = new Reservation(user, equipment,
                startTime, hours, getHourlyRate(user), certificationId, paymentStrategy);
        paymentStrategy.pay(r.getDeposit());
        reservations.add(r);
        return r;
    }

    public void modify(Reservation r, LocalDateTime newStartTime, int newHours) {
        if (r.getStatus() != Reservation.Status.PENDING) {
            throw new IllegalStateException("Only pending reservations can be modified.");
        }
        if (newStartTime.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Start time must be in the future.");
        }
        if (newHours < 1) {
            throw new IllegalArgumentException("Must book at least 1 hour.");
        }
        LocalDateTime newEnd = newStartTime.plusHours(newHours);
        if (hasConflict(r.getEquipment(), newStartTime, newEnd, r)) {
            throw new IllegalStateException("Equipment is already booked during that time.");
        }
        r.setStartTime(newStartTime);
        r.setHours(newHours);
    }

    public void extend(Reservation r, int extraHours) {
        if (r.getStatus() != Reservation.Status.ACTIVE) {
            throw new IllegalStateException("Only active reservations can be extended.");
        }
        if (extraHours < 1) {
            throw new IllegalArgumentException("Must extend by at least 1 hour.");
        }
        LocalDateTime newEnd = r.getEndTime().plusHours(extraHours);
        if (hasConflict(r.getEquipment(), r.getEndTime(), newEnd, r)) {
            throw new IllegalStateException("Equipment is already booked during the extension period.");
        }
        double extensionCost = r.getHourlyRate() * extraHours;
        r.getPaymentStrategy().pay(extensionCost);
        r.addHours(extraHours);
    }

    public void cancel(Reservation r) {
        if (r.getStatus() != Reservation.Status.PENDING) {
            throw new IllegalStateException("Only pending reservations can be cancelled.");
        }
        r.getEquipment().cancelReservation();
        r.setStatus(Reservation.Status.CANCELLED);
    }

    public void payBalance(Reservation r) {
        if (r.getStatus() != Reservation.Status.PENDING) {
            throw new IllegalStateException("Reservation is not pending.");
        }
        double balance = r.getTotalCost() - r.getDeposit();
        if (balance > 0) {
            r.getPaymentStrategy().pay(balance);
        }
        r.getEquipment().setInUseDirectly();
        r.setStatus(Reservation.Status.ACTIVE);
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
                .filter(r -> r.getEquipment().equals(equipment))
                .filter(r -> r.getStatus() == Reservation.Status.PENDING
                          || r.getStatus() == Reservation.Status.ACTIVE)
                .anyMatch(r -> start.isBefore(r.getEndTime()) && end.isAfter(r.getStartTime()));
    }
}