package com.headfirst.chapter10.statePattern.gumballmachine;

/**
 * Context class that maintains the current state of the gumball machine.
 */
public class GumballMachine {
    private final State noCoinState;
    private final State hasCoinState;
    private final State dispensingState;

    private State currentState;

    public GumballMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState = new DispensingState(this);

        currentState = noCoinState; // Initial state
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getDispensingState() {
        return dispensingState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void ejectCoin() {
        currentState.ejectCoin();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }
}
