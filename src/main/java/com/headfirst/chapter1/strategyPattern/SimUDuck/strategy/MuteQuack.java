package com.headfirst.chapter1.strategyPattern.SimUDuck.strategy;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
