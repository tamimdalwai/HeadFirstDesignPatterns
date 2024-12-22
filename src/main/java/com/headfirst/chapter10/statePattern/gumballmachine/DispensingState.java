package com.headfirst.chapter10.statePattern.gumballmachine;

/**
 * Represents the state where a gumball is being dispensed.
 */
public class DispensingState implements State {
    private final GumballMachine gumballMachine;

    public DispensingState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, already dispensing a gumball.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin cannot be ejected after turning the crank.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning the crank again won't dispense another gumball.");
    }

    @Override
    public void dispense() {
        System.out.println("Gumball dispensed. Returning to NoCoinState.");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
}
