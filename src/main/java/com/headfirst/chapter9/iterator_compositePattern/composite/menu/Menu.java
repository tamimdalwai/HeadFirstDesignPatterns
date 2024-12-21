package com.headfirst.chapter9.iterator_compositePattern.composite.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class representing a menu.
 * Only the composite has the ability to add/remove child components.
 */
public class Menu implements MenuComponent {
    private final String name;
    private final List<MenuComponent> components = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    // Adds a child component (only for Composite)
    public void add(MenuComponent component) {
        components.add(component);
    }

    // Removes a child component (only for Composite)
    public void remove(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Menu: " + name);
        for (MenuComponent component : components) {
            component.display();
        }
    }
}
