package com.headfirst.chapter9.iterator_compositePattern.composite.menu;

/**
 * Client class to test the Composite Pattern for menus.
 */
public class MenuTest {
    public static void main(String[] args) {
        // Create menu items (MenuItem implements MenuComponent)
        MenuItem pancake = new MenuItem("Pancake", 5.99);
        MenuItem waffle = new MenuItem("Waffle", 6.99);
        MenuItem coffee = new MenuItem("Coffee", 2.99);

        // Create breakfast menu and add items
        Menu breakfastMenu = new Menu("Breakfast Menu");
        breakfastMenu.add(pancake);
        breakfastMenu.add(waffle);

        // Create main menu and add sub-menus and items
        Menu mainMenu = new Menu("Main Menu");
        mainMenu.add(breakfastMenu);
        mainMenu.add(coffee);

        // Display the entire menu hierarchy
        mainMenu.display();
    }
}