package com.reservation_system.patterns.strategy;

public class DebitCardPayment implements PaymentStrategy {
    @Override
    public String getMethodName() { return "Debit Card"; }

    @Override
    public void pay(double amount) {
        System.out.printf("[DebitCard] Charged $%.2f%n", amount);
    }
}