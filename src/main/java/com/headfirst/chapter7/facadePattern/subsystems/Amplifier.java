package com.headfirst.chapter7.facadePattern.subsystems;

/**
 * Subsystem class representing an amplifier.
 */
public class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON.");
    }

    public void setVolume(int level) {
        System.out.println("Amplifier volume set to " + level);
    }
}
