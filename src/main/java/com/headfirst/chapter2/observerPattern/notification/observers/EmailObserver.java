package com.headfirst.chapter2.observerPattern.notification.observers;

/**
 * EmailObserver sends email notifications when the stock price changes.
 */
public class EmailObserver implements Observer {
    @Override
    public void update(String stockName, float price) {
        System.out.println("Email Notification - " + stockName + " is now $" + price);
    }
}