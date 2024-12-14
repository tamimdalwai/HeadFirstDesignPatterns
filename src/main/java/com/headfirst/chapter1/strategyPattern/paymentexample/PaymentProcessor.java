package com.headfirst.chapter1.strategyPattern.paymentexample;


import com.headfirst.chapter1.strategyPattern.paymentexample.strategy.PaymentStrategy;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy is not set!");
        }
        paymentStrategy.pay(amount);
    }
}
