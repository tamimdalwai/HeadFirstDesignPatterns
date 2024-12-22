package com.headfirst.chapter10.statePattern.gumballmachine;

/**
 * Represents the state where a coin is inserted.
 */
public class HasCoinState implements State {
    private final GumballMachine gumballMachine;

    public HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Coin ejected.");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank turned. Dispensing gumball...");
        gumballMachine.setState(gumballMachine.getDispensingState());
    }

    @Override
    public void dispense() {
        System.out.println("Turn the crank to dispense.");
    }
}

