package com.headfirst.chapter4.factoryPattern.simplefactory;

/**
 * Simple factory class to create pizzas.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> throw new IllegalArgumentException("Unknown pizza type: " + type);
        };
    }
}
