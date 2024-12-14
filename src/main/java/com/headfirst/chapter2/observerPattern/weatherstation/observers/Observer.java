package com.headfirst.chapter2.observerPattern.weatherstation.observers;

/**
 * The Observer interface is implemented by any class that wants to be notified of changes.
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}