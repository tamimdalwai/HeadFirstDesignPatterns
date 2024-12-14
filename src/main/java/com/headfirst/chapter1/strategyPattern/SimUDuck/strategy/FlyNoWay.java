package com.headfirst.chapter1.strategyPattern.SimUDuck.strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}