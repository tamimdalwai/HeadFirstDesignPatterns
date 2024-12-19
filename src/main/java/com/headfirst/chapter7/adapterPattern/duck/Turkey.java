package com.headfirst.chapter7.adapterPattern.duck;

/**
 * The Adaptee class with an incompatible interface.
 */
public class Turkey {
    public void gobble() {
        System.out.println("Turkey gobbles!");
    }

    public void flyShortDistance() {
        System.out.println("Turkey flies a short distance.");
    }
}
