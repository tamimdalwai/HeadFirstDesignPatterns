package com.headfirst.chapter1.strategyPattern.SimUDuck;

import com.headfirst.chapter1.strategyPattern.SimUDuck.strategy.FlyWithWings;
import com.headfirst.chapter1.strategyPattern.SimUDuck.strategy.Quack;

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
