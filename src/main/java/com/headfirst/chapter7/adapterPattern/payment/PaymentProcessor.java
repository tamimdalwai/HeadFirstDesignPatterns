package com.headfirst.chapter7.adapterPattern.payment;

/**
 * Target interface expected by the client.
 */
public interface PaymentProcessor {
    void pay(double amount);
}