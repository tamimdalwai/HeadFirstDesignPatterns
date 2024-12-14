package com.headfirst.chapter2.observerPattern.notification.observers;

/**
 * The Observer interface is implemented by any class that wants to be notified of changes.
 */
public interface Observer {
    void update(String stockName, float price);
}