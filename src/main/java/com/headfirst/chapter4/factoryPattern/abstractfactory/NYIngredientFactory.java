package com.headfirst.chapter4.factoryPattern.abstractfactory;

/**
 * Concrete factory for New York-style ingredients.
 */
public class NYIngredientFactory implements IngredientFactory {
    @Override
    public String createDough() {
        return "Thin Crust Dough";
    }

    @Override
    public String createSauce() {
        return "Marinara Sauce";
    }

    @Override
    public String createCheese() {
        return "Reggiano Cheese";
    }
}