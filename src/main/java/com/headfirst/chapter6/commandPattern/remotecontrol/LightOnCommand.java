package com.headfirst.chapter6.commandPattern.remotecontrol;

/**
 * Command to turn the light on.
 */
public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
