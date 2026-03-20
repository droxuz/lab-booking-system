package com.reservation_system.patterns.strategy;

public class InstitutionalPayment implements PaymentStrategy {
    @Override
    public String getMethodName() { return "Institutional Account"; }

    @Override
    public void pay(double amount) {
        System.out.printf("[Institutional] Billed $%.2f%n", amount);
    }
}