package com.headfirst.chapter2.observerPattern.weatherstation.subject;


import com.headfirst.chapter2.observerPattern.weatherstation.subject.Subject;
import com.headfirst.chapter2.observerPattern.weatherstation.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherData is the concrete implementation of the Subject interface.
 * It holds the weather data and notifies observers of any changes.
 */
public class WeatherData implements Subject {
    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers(); // Notify observers whenever the measurements change
    }
}