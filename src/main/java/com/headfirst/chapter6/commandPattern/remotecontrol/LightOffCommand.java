package com.headfirst.chapter6.commandPattern.remotecontrol;

/**
 * Command to turn the light off.
 */
public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
