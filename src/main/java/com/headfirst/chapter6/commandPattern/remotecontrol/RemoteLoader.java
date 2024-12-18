package com.headfirst.chapter6.commandPattern.remotecontrol;

/**
 * The Client class to set up and test the Command Pattern.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Commands
        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        // Simulate button presses
        remoteControl.onButtonPressed(0); // Turn the light on
        remoteControl.offButtonPressed(0); // Turn the light off
    }
}
