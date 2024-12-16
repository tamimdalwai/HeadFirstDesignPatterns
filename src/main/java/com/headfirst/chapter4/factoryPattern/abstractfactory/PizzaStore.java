package com.headfirst.chapter4.factoryPattern.abstractfactory;

/**
 * Abstract PizzaStore class defines a method for ordering pizza.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
