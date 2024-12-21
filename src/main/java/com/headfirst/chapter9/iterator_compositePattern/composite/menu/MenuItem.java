package com.headfirst.chapter9.iterator_compositePattern.composite.menu;

/**
 * Leaf class representing a menu item.
 */
public class MenuItem implements MenuComponent {
    private final String name;
    private final double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Item: " + name + ", Price: $" + price);
    }
}
