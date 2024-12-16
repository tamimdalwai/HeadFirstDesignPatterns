package com.headfirst.chapter4.factoryPattern.abstractfactory;

/**
 * Abstract base class for pizzas.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    String cheese;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}