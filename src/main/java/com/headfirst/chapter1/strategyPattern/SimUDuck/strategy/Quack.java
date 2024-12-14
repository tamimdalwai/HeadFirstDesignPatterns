package com.headfirst.chapter1.strategyPattern.SimUDuck.strategy;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
