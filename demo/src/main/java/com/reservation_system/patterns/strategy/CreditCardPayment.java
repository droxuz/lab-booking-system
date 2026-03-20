package com.reservation_system.patterns.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public String getMethodName() { return "Credit Card"; }

    @Override
    public void pay(double amount) {
        System.out.printf("[CreditCard] Charged $%.2f%n", amount);
    }
}