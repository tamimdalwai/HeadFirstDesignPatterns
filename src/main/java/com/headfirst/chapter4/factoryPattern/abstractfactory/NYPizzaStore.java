package com.headfirst.chapter4.factoryPattern.abstractfactory;

/**
 * New York-style PizzaStore that uses NYIngredientFactory.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        IngredientFactory ingredientFactory = new NYIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            Pizza pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
            return pizza;
        }

        throw new IllegalArgumentException("Unknown pizza type: " + type);
    }
}
