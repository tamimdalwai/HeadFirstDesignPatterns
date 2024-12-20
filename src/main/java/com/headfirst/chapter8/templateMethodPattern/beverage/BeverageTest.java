package com.headfirst.chapter8.templateMethodPattern.beverage;

/**
 * Client class to test the beverage preparation.
 */
public class BeverageTest {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        System.out.println("Making tea:");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee:");
        coffee.prepareRecipe();
    }
}
