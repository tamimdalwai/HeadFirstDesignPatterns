package com.headfirst.chapter8.templateMethodPattern.beverage;

/**
 * Concrete class for preparing coffee.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}