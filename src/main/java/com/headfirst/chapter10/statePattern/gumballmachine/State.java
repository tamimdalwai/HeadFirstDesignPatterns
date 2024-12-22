package com.headfirst.chapter10.statePattern.gumballmachine;

/**
 * State interface that defines the behavior for all states.
 */
public interface State {
    void insertCoin();
    void ejectCoin();
    void turnCrank();
    void dispense();
}
