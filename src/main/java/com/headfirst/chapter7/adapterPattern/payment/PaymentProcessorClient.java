package com.headfirst.chapter7.adapterPattern.payment;

/**
 * Client class to test the Payment Gateway Adapter.
 */
public class PaymentProcessorClient {
    public static void main(String[] args) {
        // Adaptee: Third-party payment gateway
        ThirdPartyPaymentGateway thirdPartyGateway = new ThirdPartyPaymentGateway();

        // Adapter: Makes the third-party gateway compatible with PaymentProcessor interface
        PaymentProcessor paymentProcessor = new PaymentGatewayAdapter(thirdPartyGateway);

        // Client: Uses the PaymentProcessor interface
        paymentProcessor.pay(150.75); // Payment of $150.75 made via Third-Party Gateway.
    }
}
