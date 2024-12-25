package com.headfirst.chapter11.proxyPattern.imageviewer;

/**
 * Proxy for loading images lazily.
 */
public class ImageProxy implements Image {
    private final String fileName;
    private HighResolutionImage highResolutionImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (highResolutionImage == null) {
            highResolutionImage = new HighResolutionImage(fileName);
        }
        highResolutionImage.display();
    }
}