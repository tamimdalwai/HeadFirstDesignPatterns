package com.headfirst.chapter5.singletonPattern;

/**
 * Singleton implementation using Enum.
 * This approach is thread-safe, reflection-safe, and serialization-safe.
 */
public enum EnumSingleton {
    INSTANCE;

    // Add any methods or fields here
    public void showMessage() {
        System.out.println("Hello from Enum Singleton!");
    }
}
