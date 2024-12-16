package com.headfirst.chapter4.factoryPattern.realworldexample;

/**
 * Abstract dialog defines the factory method.
 */
public abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.render();
        button.onClick();
    }

    protected abstract Button createButton();
}