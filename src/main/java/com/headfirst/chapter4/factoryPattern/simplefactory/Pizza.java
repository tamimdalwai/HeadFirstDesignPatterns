package com.headfirst.chapter4.factoryPattern.simplefactory;

/**
 * Abstract base class for all pizzas.
 */
public abstract class Pizza {
    public abstract String getDescription();
    public void prepare() {
        System.out.println("Preparing " + getDescription());
    }
    public void bake() {
        System.out.println("Baking " + getDescription());
    }
    public void cut() {
        System.out.println("Cutting " + getDescription());
    }
    public void box() {
        System.out.println("Boxing " + getDescription());
    }
}