package com.headfirst.chapter9.iterator_compositePattern.iterator.menu;

import java.util.List;

/**
 * Concrete iterator for traversing a menu.
 */
public class MenuIterator implements Iterator {
    private final List<String> items;
    private int position = 0;

    public MenuIterator(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more items");
        }
        return items.get(position++);
    }
}
