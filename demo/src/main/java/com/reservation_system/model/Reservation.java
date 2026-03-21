package com.reservation_system.model;

import com.reservation_system.Equipment.Equipment;
import com.reservation_system.patterns.strategy.PaymentStrategy;
import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {

    public enum Status { PENDING, ACTIVE, CANCELLED }

    private final UUID id;
    private final User user;
    private final Equipment equipment;
    private LocalDateTime startTime;
    private int hours;
    private final double hourlyRate;
    private final double deposit;
    private double totalCost;
    private final String certificationId;
    private final PaymentStrategy paymentStrategy;
    private Status status;

    public Reservation(User user, Equipment equipment,
                       LocalDateTime startTime, int hours,
                       double hourlyRate, String certificationId,
                       PaymentStrategy paymentStrategy) {
        this.id              = UUID.randomUUID();
        this.user            = user;
        this.equipment       = equipment;
        this.startTime       = startTime;
        this.hours           = hours;
        this.hourlyRate      = hourlyRate;
        this.deposit         = hourlyRate;
        this.totalCost       = hourlyRate * hours;
        this.certificationId = certificationId;
        this.paymentStrategy = paymentStrategy;
        this.status          = Status.PENDING;
    }

    public UUID getId()                         { return id; }
    public User getUser()                       { return user; }
    public Equipment getEquipment()             { return equipment; }
    public LocalDateTime getStartTime()         { return startTime; }
    public LocalDateTime getEndTime()           { return startTime.plusHours(hours); }
    public int getHours()                       { return hours; }
    public double getHourlyRate()               { return hourlyRate; }
    public double getDeposit()                  { return deposit; }
    public double getTotalCost()                { return totalCost; }
    public String getCertificationId()          { return certificationId; }
    public PaymentStrategy getPaymentStrategy() { return paymentStrategy; }
    public Status getStatus()                   { return status; }
    public void setStatus(Status status)        { this.status = status; }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setHours(int hours) {
        this.hours     = hours;
        this.totalCost = hourlyRate * hours;
    }

    public void addHours(int extra) {
        this.hours    += extra;
        this.totalCost = hourlyRate * this.hours;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s | %s | %dh | $%.0f | %s",
                id.toString().substring(0, 6).toUpperCase(),
                equipment.getDescription(), equipment.getLabLocation(),
                hours, totalCost, status);
    }
}