package com.headfirst.chapter3.decoratorPattern.beverages;

/**
 * Base interface for all beverages.
 * Defines a method to get the description and cost of a beverage.
 */
public interface Beverage {
    String getDescription();
    double getCost();
}