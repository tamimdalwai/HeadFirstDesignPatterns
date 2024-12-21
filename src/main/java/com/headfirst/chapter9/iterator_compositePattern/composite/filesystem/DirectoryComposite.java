package com.headfirst.chapter9.iterator_compositePattern.composite.filesystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class representing a directory.
 */
public class DirectoryComposite implements FileComponent {
    private final String name;
    private final List<FileComponent> children = new ArrayList<>();

    public DirectoryComposite(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    public void remove(FileComponent component) {
        children.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Directory: " + name);
        for (FileComponent child : children) {
            child.display(indent + "  ");
        }
    }
}