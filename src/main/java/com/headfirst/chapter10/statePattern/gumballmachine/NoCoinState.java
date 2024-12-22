package com.headfirst.chapter10.statePattern.gumballmachine;

/**
 * Represents the state where no coin is inserted.
 */
public class NoCoinState implements State {
    private final GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. You can turn the crank now.");
        gumballMachine.setState(gumballMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("No coin to eject.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Insert a coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed.");
    }
}
