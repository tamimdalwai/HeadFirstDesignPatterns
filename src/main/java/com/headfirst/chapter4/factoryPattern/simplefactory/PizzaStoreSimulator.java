package com.headfirst.chapter4.factoryPattern.simplefactory;

public class PizzaStoreSimulator {
    private final SimplePizzaFactory factory;

    public PizzaStoreSimulator(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStoreSimulator store = new PizzaStoreSimulator(factory);

        store.orderPizza("cheese");
        store.orderPizza("pepperoni");
    }
}

