package com.headfirst.chapter8.templateMethodPattern.beverage;

/**
 * Concrete class for preparing tea.
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
