package com.headfirst.chapter6.commandPattern.aircraft;


/**
 * The Receiver class that knows how to perform the operations.
 */
public class LandingGear {
    public void up() {
        System.out.println("Landing gear is retracted.");
    }

    public void down() {
        System.out.println("Landing gear is lowered.");
    }
}