package com.headfirst.chapter5.singletonPattern;

/**
 * Lazy Singleton Implementation.
 * The instance is created only when it is first requested.
 */
public class LazySingleton {
    // Static instance initialized as null
    private static LazySingleton instance;

    // Private constructor prevents external instantiation
    private LazySingleton() {}

    // Synchronized method ensures thread safety
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
