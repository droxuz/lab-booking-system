package com.reservation_system.patterns.strategy;

public interface PaymentStrategy {
    String getMethodName();
    void pay(double amount);
}