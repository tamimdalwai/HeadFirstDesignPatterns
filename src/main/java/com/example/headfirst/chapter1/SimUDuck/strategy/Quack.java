package com.example.headfirst.chapter1.SimUDuck.strategy;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
