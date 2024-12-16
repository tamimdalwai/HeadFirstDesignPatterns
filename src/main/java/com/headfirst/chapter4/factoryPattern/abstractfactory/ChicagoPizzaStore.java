package com.headfirst.chapter4.factoryPattern.abstractfactory;

/**
 * Chicago-style PizzaStore that uses ChicagoIngredientFactory.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        IngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            Pizza pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
            return pizza;
        }

        throw new IllegalArgumentException("Unknown pizza type: " + type);
    }
}