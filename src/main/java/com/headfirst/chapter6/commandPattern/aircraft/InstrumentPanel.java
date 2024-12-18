package com.headfirst.chapter6.commandPattern.aircraft;

/**
 * The Invoker class that triggers commands.
 */
public class InstrumentPanel {
    private final Command[] commands = new Command[2];

    public void setCommand(int index, Command command) {
        commands[index] = command;
    }

    public void pressButton(int index) {
        if (commands[index] != null) {
            commands[index].execute();
        } else {
            System.out.println("No command assigned to this button.");
        }
    }
}