package com.headfirst.chapter5.singletonPattern;

import java.io.Serializable;

/**
 * Singleton Implementation Safe from Serialization.
 */
public class SerializationSafeSingleton implements Serializable {
    private static final long serialVersionUID = 1L;

    // Static instance
    private static final SerializationSafeSingleton instance = new SerializationSafeSingleton();

    // Private constructor prevents external instantiation
    private SerializationSafeSingleton() {}

    // Public method to provide access to the instance
    public static SerializationSafeSingleton getInstance() {
        return instance;
    }

    // Prevents creating a new instance during deserialization
    protected Object readResolve() {
        return instance;
    }
}
