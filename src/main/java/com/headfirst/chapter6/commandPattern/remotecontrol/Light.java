package com.headfirst.chapter6.commandPattern.remotecontrol;

/**
 * The Receiver class that knows how to perform light operations.
 */
public class Light {
    public void on() {
        System.out.println("Light is ON.");
    }

    public void off() {
        System.out.println("Light is OFF.");
    }
}
