package com.headfirst.chapter7.adapterPattern.duck;

/**
 * Client class to test the Adapter Pattern with Duck and Turkey.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        // A standard Duck object
        Duck mallardDuck = new MallardDuck();

        // A Turkey object
        Turkey wildTurkey = new Turkey();

        // Adapter to make Turkey compatible with Duck interface
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        // Testing the Turkey directly
        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.flyShortDistance();

        // Testing the Duck interface
        System.out.println("\nThe Duck says...");
        testDuck(mallardDuck);

        // Testing the TurkeyAdapter
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    /**
     * Tests any object that implements the Duck interface.
     *
     * @param duck the object to be tested
     */
    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

