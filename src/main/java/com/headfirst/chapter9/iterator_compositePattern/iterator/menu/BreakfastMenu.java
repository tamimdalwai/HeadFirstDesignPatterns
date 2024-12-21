package com.headfirst.chapter9.iterator_compositePattern.iterator.menu;

import java.util.List;

/**
 * Concrete aggregate representing a breakfast menu.
 */
public class BreakfastMenu implements Menu {
    private final List<String> menuItems;

    public BreakfastMenu(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new MenuIterator(menuItems);
    }
}
