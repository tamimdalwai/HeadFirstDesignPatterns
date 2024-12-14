package com.headfirst.chapter2.observerPattern.weatherstation.subject;

import com.headfirst.chapter2.observerPattern.weatherstation.observers.Observer;

/**
 * The Subject interface is implemented by any class that wants to act as a publisher.
 * It maintains a list of observers and notifies them of changes in state.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}