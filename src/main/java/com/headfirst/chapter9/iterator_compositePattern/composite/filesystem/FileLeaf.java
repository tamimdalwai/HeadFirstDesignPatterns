package com.headfirst.chapter9.iterator_compositePattern.composite.filesystem;


/**
 * Leaf class representing a file.
 */
public class FileLeaf implements FileComponent {
    private final String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "File: " + name);
    }
}