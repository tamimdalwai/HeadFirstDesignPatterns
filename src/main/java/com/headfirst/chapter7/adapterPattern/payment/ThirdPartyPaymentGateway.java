package com.headfirst.chapter7.adapterPattern.payment;

/**
 * Adaptee class with an incompatible API.
 */
public class ThirdPartyPaymentGateway {
    public void makePayment(double amountInDollars) {
        System.out.println("Payment of $" + amountInDollars + " made via Third-Party Gateway.");
    }
}
