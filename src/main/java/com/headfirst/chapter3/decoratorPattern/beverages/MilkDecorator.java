package com.headfirst.chapter3.decoratorPattern.beverages;

/**
 * Concrete decorator for adding milk to a beverage.
 */
public class MilkDecorator implements Beverage {
    private final Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50; // Adding cost of milk
    }
}