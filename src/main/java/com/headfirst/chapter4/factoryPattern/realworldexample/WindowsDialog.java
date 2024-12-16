package com.headfirst.chapter4.factoryPattern.realworldexample;

/**
 * Windows dialog creates Windows buttons.
 */
public class WindowsDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
