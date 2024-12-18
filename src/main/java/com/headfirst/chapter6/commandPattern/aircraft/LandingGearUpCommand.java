package com.headfirst.chapter6.commandPattern.aircraft;

/**
 * Command to retract the landing gear.
 */
public class LandingGearUpCommand implements Command {
    private final LandingGear landingGear;

    public LandingGearUpCommand(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    @Override
    public void execute() {
        landingGear.up();
    }
}
