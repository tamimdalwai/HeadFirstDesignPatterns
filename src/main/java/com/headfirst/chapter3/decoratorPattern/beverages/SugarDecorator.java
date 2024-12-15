package com.headfirst.chapter3.decoratorPattern.beverages;

/**
 * Concrete decorator for adding sugar to a beverage.
 */
public class SugarDecorator implements Beverage {
    private final Beverage beverage;

    public SugarDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.25; // Adding cost of sugar
    }
}