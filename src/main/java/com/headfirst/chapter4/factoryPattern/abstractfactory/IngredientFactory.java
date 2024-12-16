package com.headfirst.chapter4.factoryPattern.abstractfactory;

/**
 * Abstract factory interface for creating pizza ingredients.
 */
public interface IngredientFactory {
    String createDough();
    String createSauce();
    String createCheese();
}