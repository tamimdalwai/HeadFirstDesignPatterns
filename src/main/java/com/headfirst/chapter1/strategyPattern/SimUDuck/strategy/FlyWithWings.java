package com.headfirst.chapter1.strategyPattern.SimUDuck.strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}
