package com.headfirst.chapter7.adapterPattern.duck;

/**
 * Adapter class that bridges the Turkey class to the Duck interface.
 */
public class TurkeyAdapter implements Duck {
    private final Turkey turkey;

    /**
     * Constructor to wrap the Turkey object.
     *
     * @param turkey the adaptee object
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        // Adapts Turkey's gobble to Duck's quack
        turkey.gobble();
    }

    @Override
    public void fly() {
        // Adapts Turkey's short flights to Duck's long flights by repeating
        for (int i = 0; i < 5; i++) {
            turkey.flyShortDistance();
        }
    }
}
