package com.example.headfirst.chapter1.SimUDuck;

import com.example.headfirst.chapter1.SimUDuck.strategy.FlyNoWay;
import com.example.headfirst.chapter1.SimUDuck.strategy.FlyWithWings;
import com.example.headfirst.chapter1.SimUDuck.strategy.MuteQuack;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        // Dynamically changing behavior
        Duck modelDuck = new MallardDuck();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.performQuack();
        modelDuck.performFly();

        // Switching to fly behavior dynamically
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();
    }
}
