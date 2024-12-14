package com.headfirst.chapter2.observerPattern.notification.subject;

import com.headfirst.chapter2.observerPattern.notification.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * StockSubject acts as the concrete subject, managing stock price updates.
 */
public class StockSubject implements Subject {
    private final List<Observer> observers;
    private String stockName;
    private float stockPrice;

    public StockSubject() {
        observers = new ArrayList<>();
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
            observer.update(stockName, stockPrice);
        }
    }

    public void setStockData(String stockName, float stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}