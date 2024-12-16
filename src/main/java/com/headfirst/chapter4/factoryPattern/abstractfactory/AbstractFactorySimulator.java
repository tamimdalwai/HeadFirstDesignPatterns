package com.headfirst.chapter4.factoryPattern.abstractfactory;

/**
 * Main class for testing the Abstract Factory implementation.
 */
public class AbstractFactorySimulator {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("\n--- Ordering a New York Style Cheese Pizza ---");
        nyStore.orderPizza("cheese");

        System.out.println("\n--- Ordering a Chicago Style Cheese Pizza ---");
        chicagoStore.orderPizza("cheese");
    }
}
