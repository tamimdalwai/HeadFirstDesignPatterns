package com.headfirst.chapter10.statePattern.gumballmachine;

/**
 * Client to test the Gumball Machine implementation of the State Pattern.
 */
public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine();

        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        gumballMachine.insertCoin();
        gumballMachine.ejectCoin();
    }
}
