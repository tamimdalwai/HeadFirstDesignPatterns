package com.headfirst.chapter6.commandPattern.aircraft;

/**
 * The Client class to set up and test the Command Pattern.
 */
public class AircraftSimulator {
    public static void main(String[] args) {
        // Receiver
        LandingGear landingGear = new LandingGear();

        // Commands
        Command gearUpCommand = new LandingGearUpCommand(landingGear);
        Command gearDownCommand = new LandingGearDownCommand(landingGear);

        // Invoker
        InstrumentPanel panel = new InstrumentPanel();
        panel.setCommand(0, gearUpCommand);
        panel.setCommand(1, gearDownCommand);

        // Simulate button presses
        panel.pressButton(1); // Lower landing gear
        panel.pressButton(0); // Retract landing gear
    }
}
