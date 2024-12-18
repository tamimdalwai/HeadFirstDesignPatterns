package com.headfirst.chapter6.commandPattern.remotecontrol;

/**
 * The Invoker class that triggers commands.
 */
public class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7]; // Supports 7 slots
        offCommands = new Command[7];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].execute();
        } else {
            System.out.println("No command assigned to ON button in slot " + slot);
        }
    }

    public void offButtonPressed(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].execute();
        } else {
            System.out.println("No command assigned to OFF button in slot " + slot);
        }
    }
}