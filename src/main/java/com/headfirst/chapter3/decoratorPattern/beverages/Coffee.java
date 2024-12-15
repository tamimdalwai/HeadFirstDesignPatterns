package com.headfirst.chapter3.decoratorPattern.beverages;

/**
 * Concrete component representing plain coffee.
 */
public class Coffee implements Beverage {

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 2.00; // Base price of plain coffee
    }
}