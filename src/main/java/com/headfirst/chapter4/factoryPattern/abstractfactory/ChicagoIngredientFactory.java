package com.headfirst.chapter4.factoryPattern.abstractfactory;

/**
 * Concrete factory for Chicago-style ingredients.
 */
public class ChicagoIngredientFactory implements IngredientFactory {
    @Override
    public String createDough() {
        return "Thick Crust Dough";
    }

    @Override
    public String createSauce() {
        return "Plum Tomato Sauce";
    }

    @Override
    public String createCheese() {
        return "Mozzarella Cheese";
    }
}
