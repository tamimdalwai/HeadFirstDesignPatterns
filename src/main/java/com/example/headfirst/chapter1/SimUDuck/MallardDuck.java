package com.example.headfirst.chapter1.SimUDuck;

import com.example.headfirst.chapter1.SimUDuck.strategy.FlyWithWings;
import com.example.headfirst.chapter1.SimUDuck.strategy.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck!");
    }
}
