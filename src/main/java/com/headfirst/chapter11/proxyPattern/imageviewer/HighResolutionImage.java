package com.headfirst.chapter11.proxyPattern.imageviewer;

/**
 * Real Subject representing a high-resolution image.
 */
public class HighResolutionImage implements Image {
    private final String fileName;

    public HighResolutionImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading high-resolution image: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }
}

