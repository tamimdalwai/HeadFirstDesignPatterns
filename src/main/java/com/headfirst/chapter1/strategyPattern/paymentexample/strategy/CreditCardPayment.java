package com.headfirst.chapter1.strategyPattern.paymentexample.strategy;

public class CreditCardPayment implements PaymentStrategy{
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card (Card Number: " + cardNumber + ").");
    }
}
