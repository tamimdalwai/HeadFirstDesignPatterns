package com.headfirst.chapter9.iterator_compositePattern.iterator.menu;

import java.util.Arrays;

/**
 * Client class to test the Iterator Pattern for menus.
 */
public class MenuTest {
    public static void main(String[] args) {
        Menu breakfastMenu = new BreakfastMenu(Arrays.asList("Pancakes", "Waffles", "Omelette"));
        Iterator iterator = breakfastMenu.createIterator();

        System.out.println("Breakfast Menu:");
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }
}
