package com.reservation_system.patterns.strategy;

public class GrantPayment implements PaymentStrategy {
    @Override
    public String getMethodName() { return "Research Grant"; }

    @Override
    public void pay(double amount) {
        System.out.printf("[Research Grant] Charged $%.2f%n", amount);
    }
}