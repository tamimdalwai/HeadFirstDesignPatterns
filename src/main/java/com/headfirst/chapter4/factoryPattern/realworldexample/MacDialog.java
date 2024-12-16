package com.headfirst.chapter4.factoryPattern.realworldexample;

/**
 * Mac dialog creates Mac buttons.
 */
public class MacDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new MacButton();
    }
}
