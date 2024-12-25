package com.headfirst.chapter11.proxyPattern.imageviewer;


/**
 * Client to demonstrate Virtual Proxy with Image Viewer.
 */
public class ImageViewer {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("photo1.jpg");
        Image image2 = new ImageProxy("photo2.jpg");

        System.out.println("Displaying images for the first time:");
        image1.display(); // Loads and displays
        image2.display(); // Loads and displays

        System.out.println("\nDisplaying images again:");
        image1.display(); // Displays without loading
        image2.display(); // Displays without loading
    }
}