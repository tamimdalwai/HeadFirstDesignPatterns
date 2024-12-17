package com.headfirst.chapter5.singletonPattern;

/**
 * Singleton Implementation Safe from Reflection Attacks.
 */
public class ReflectionSafeSingleton {
    private static ReflectionSafeSingleton instance;

    // Private constructor prevents external instantiation
    private ReflectionSafeSingleton() {
        if (instance != null) {
            throw new IllegalStateException("Instance already created!");
        }
    }

    // Public method to provide access to the instance
    public static ReflectionSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ReflectionSafeSingleton();
        }
        return instance;
    }
}
