package com.headfirst.chapter2.observerPattern.notification;

import com.headfirst.chapter2.observerPattern.notification.observers.EmailObserver;
import com.headfirst.chapter2.observerPattern.notification.subject.StockSubject;

public class NotificationSystemSimulator {
    public static void main(String[] args) {
        StockSubject stockSubject = new StockSubject();

        EmailObserver emailObserver = new EmailObserver();
        stockSubject.registerObserver(emailObserver);

        // Simulate stock price updates
        stockSubject.setStockData("AAPL", 150.0f);
        stockSubject.setStockData("GOOGL", 2800.0f);
    }
}
