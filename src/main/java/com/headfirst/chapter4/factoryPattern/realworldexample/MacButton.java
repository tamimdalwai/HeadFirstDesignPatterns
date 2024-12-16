package com.headfirst.chapter4.factoryPattern.realworldexample;

/**
 * Mac-specific button implementation.
 */
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Mac button.");
    }

    @Override
    public void onClick() {
        System.out.println("Click event for Mac button.");
    }
}
