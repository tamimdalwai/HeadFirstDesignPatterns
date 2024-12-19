package com.headfirst.chapter7.facadePattern.subsystems;

/**
 * Subsystem class representing a projector.
 */
public class Projector {
    public void on() {
        System.out.println("Projector is ON.");
    }

    public void wideScreenMode() {
        System.out.println("Projector is set to widescreen mode.");
    }
}
