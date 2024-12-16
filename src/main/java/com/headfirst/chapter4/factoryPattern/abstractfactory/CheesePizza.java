package com.headfirst.chapter4.factoryPattern.abstractfactory;

/**
 * Concrete product representing a Cheese Pizza.
 */
public class CheesePizza extends Pizza {
    IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        System.out.println("Using ingredients: " + dough + ", " + sauce + ", " + cheese);
    }
}
