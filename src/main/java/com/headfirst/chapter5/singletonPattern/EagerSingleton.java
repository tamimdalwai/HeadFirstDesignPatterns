package com.headfirst.chapter5.singletonPattern;

/**
 * Eager Singleton Implementation.
 * The instance is created at class loading time.
 */
public class EagerSingleton {
    // Static instance created eagerly at class loading
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor prevents external instantiation
    private EagerSingleton() {}

    // Public method to provide global access to the instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}
