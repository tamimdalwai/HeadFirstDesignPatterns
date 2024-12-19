package com.headfirst.chapter7.adapterPattern.duck;

/**
 * A concrete implementation of the Duck interface.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Mallard Duck quacks!");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck flies long distances.");
    }
}
