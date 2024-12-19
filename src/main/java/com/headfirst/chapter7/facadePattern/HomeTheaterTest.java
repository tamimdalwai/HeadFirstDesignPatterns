package com.headfirst.chapter7.facadePattern;

import com.headfirst.chapter7.facadePattern.subsystems.Amplifier;
import com.headfirst.chapter7.facadePattern.subsystems.HomeTheaterFacade;
import com.headfirst.chapter7.facadePattern.subsystems.Projector;
import com.headfirst.chapter7.facadePattern.subsystems.TheaterLights;

/**
 * Client class to test the Home Theater Facade.
 */
public class HomeTheaterTest {
    public static void main(String[] args) {
        // Create subsystems
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, projector, lights);

        // Use the facade to watch a movie
        homeTheater.watchMovie();
    }
}
