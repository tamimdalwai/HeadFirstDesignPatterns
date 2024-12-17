package com.headfirst.chapter5.singletonPattern;

/**
 * Double-Checked Locking Singleton Implementation.
 * Ensures thread safety with reduced synchronization overhead.
 */
public class DoubleCheckedSingleton {
    // Volatile ensures visibility of changes across threads
    private static volatile DoubleCheckedSingleton instance;

    // Private constructor prevents external instantiation
    private DoubleCheckedSingleton() {}

    // Double-checked locking for lazy initialization
    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) { // First check
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) { // Second check
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
