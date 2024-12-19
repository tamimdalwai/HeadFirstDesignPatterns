package com.headfirst.chapter7.adapterPattern.payment;

/**
 * Adapter class to make ThirdPartyPaymentGateway compatible with PaymentProcessor.
 */
public class PaymentGatewayAdapter implements PaymentProcessor {
    private final ThirdPartyPaymentGateway thirdPartyGateway;

    /**
     * Constructor to wrap the third-party gateway.
     *
     * @param thirdPartyGateway the adaptee object
     */
    public PaymentGatewayAdapter(ThirdPartyPaymentGateway thirdPartyGateway) {
        this.thirdPartyGateway = thirdPartyGateway;
    }

    @Override
    public void pay(double amount) {
        // Adapts the makePayment method to pay method
        thirdPartyGateway.makePayment(amount);
    }
}
