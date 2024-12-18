package com.headfirst.chapter6.commandPattern.aircraft;

/**
 * Command to lower the landing gear.
 */
public class LandingGearDownCommand implements Command {
    private final LandingGear landingGear;

    public LandingGearDownCommand(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    @Override
    public void execute() {
        landingGear.down();
    }
}
