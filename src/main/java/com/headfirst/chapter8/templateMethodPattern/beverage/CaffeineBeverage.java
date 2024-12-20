package com.headfirst.chapter8.templateMethodPattern.beverage;

/**
 * Abstract class defining the template method for preparing beverages.
 */
public abstract class CaffeineBeverage {

    /**
     * Template method defining the steps to prepare a beverage.
     * This method is final to prevent modification by subclasses.
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract methods for subclass-specific behavior
    protected abstract void brew();
    protected abstract void addCondiments();
}