package com.example.headfirst.chapter1.paymentexample.strategy;

public class PayPalPayment implements PaymentStrategy{
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal (Email: " + email + ").");
    }
}
