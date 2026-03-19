package com.reservation_system.services;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.Sensor.SensorType;
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
                            int hours, String certificationId,
                            PaymentStrategy paymentStrategy) {
        if (!equipment.isAvailable()) {
            throw new IllegalStateException("Equipment is not available.");
        }
        if (hours < 1) {
            throw new IllegalArgumentException("Must book at least 1 hour.");
        }
        if (certificationId == null || certificationId.isBlank()) {
            throw new IllegalArgumentException("Student/Staff ID or certification number is required.");
        }
        equipment.reserve();
        Reservation r = new Reservation(user, equipment,
                LocalDateTime.now(), hours, getHourlyRate(user), certificationId, paymentStrategy);
        paymentStrategy.pay(r.getDeposit());
        reservations.add(r);
        return r;
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
        r.getEquipment().checkIn(SensorType.USAGE_DETECTED);
        r.setStatus(Reservation.Status.ACTIVE);
    }

    public List<Reservation> getForUser(User user) {
        return reservations.stream()
                .filter(r -> r.getUser().getID() == user.getID())
                .collect(Collectors.toList());
    }
}