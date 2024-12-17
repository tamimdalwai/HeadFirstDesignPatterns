package com.headfirst.chapter5.singletonPattern;

/**
 * Simulation class to test all Singleton implementations.
 */
public class SingletonSimulator {
    public static void main(String[] args) {
        System.out.println("Testing Singleton Implementations:\n");

        // Eager Singleton
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("Eager Singleton: " + (eagerSingleton1 == eagerSingleton2));

        // Lazy Singleton
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("Lazy Singleton: " + (lazySingleton1 == lazySingleton2));

        // Double-Checked Locking Singleton
        DoubleCheckedSingleton doubleChecked1 = DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton doubleChecked2 = DoubleCheckedSingleton.getInstance();
        System.out.println("Double-Checked Singleton: " + (doubleChecked1 == doubleChecked2));

        // Reflection Safe Singleton
        ReflectionSafeSingleton reflectionSafe1 = ReflectionSafeSingleton.getInstance();
        ReflectionSafeSingleton reflectionSafe2 = ReflectionSafeSingleton.getInstance();
        System.out.println("Reflection Safe Singleton: " + (reflectionSafe1 == reflectionSafe2));

        // Serialization Safe Singleton
        SerializationSafeSingleton serializationSafe1 = SerializationSafeSingleton.getInstance();
        SerializationSafeSingleton serializationSafe2 = SerializationSafeSingleton.getInstance();
        System.out.println("Serialization Safe Singleton: " + (serializationSafe1 == serializationSafe2));

        // Enum Singleton
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        System.out.println("Enum Singleton: " + (enumSingleton1 == enumSingleton2));
        enumSingleton1.showMessage();
    }
}
