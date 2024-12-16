package com.headfirst.chapter4.factoryPattern.realworldexample;


/**
 * Windows-specific button implementation.
 */
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button.");
    }

    @Override
    public void onClick() {
        System.out.println("Click event for Windows button.");
    }
}