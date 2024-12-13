package com.example.headfirst.chapter1.paymentexample;

import com.example.headfirst.chapter1.paymentexample.strategy.CreditCardPayment;
import com.example.headfirst.chapter1.paymentexample.strategy.PayPalPayment;

public class PaymentSimulator {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Use Credit Card Payment
        processor.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        processor.processPayment(150.00);

        // Switch to PayPal Payment
        processor.setPaymentStrategy(new PayPalPayment("user@example.com"));
        processor.processPayment(200.00);
    }
}