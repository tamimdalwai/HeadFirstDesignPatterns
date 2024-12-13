# Chapter 1: Strategy Pattern - Duck Simulation Example

## Introduction to Strategy Pattern
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from the clients that use it.

In the **SimUDuck** example, we use the Strategy Pattern to handle different behaviors for ducks, such as flying and quacking.

---

## Package Structure
```
com.example.headfirst.chapter1.SimUDuck/
├── Duck.java                # Abstract Duck class
├── MallardDuck.java         # A concrete implementation of Duck
├── MiniDuckSimulator.java   # Main class to test the behaviors
└── strategy/
    ├── FlyBehavior.java     # Fly strategy interface
    ├── FlyNoWay.java        # Concrete strategy: Cannot fly
    ├── FlyWithWings.java    # Concrete strategy: Fly with wings
    ├── QuackBehavior.java   # Quack strategy interface
    ├── Quack.java           # Concrete strategy: Quack
    └── MuteQuack.java       # Concrete strategy: No sound
```

---

## Key Concepts
### Why Use the Strategy Pattern?
1. **Encapsulation of Behavior**: Fly and quack behaviors are encapsulated into separate classes.
2. **Flexibility**: Behaviors can be switched dynamically without modifying the duck classes.
3. **Reusability**: Common behaviors can be reused across multiple duck types.

### When to Use It?
- When you have multiple classes differing only in their behavior.
- When you need to dynamically change behavior at runtime.
- When you want to avoid complex conditional logic for handling multiple behaviors.

---

## Implementation Details
### Classes:
1. **`Duck` (Abstract Class)**: Defines common behavior like `swim` and delegates flying and quacking to behaviors.
2. **Concrete Ducks**: Examples include `MallardDuck`, which extends `Duck` and provides a custom display method.
3. **Behaviors**:
    - **Fly Behaviors**:
        - `FlyWithWings`: Ducks that can fly.
        - `FlyNoWay`: Ducks that cannot fly.
    - **Quack Behaviors**:
        - `Quack`: Ducks that quack.
        - `MuteQuack`: Ducks that do not quack.

---

## Code Usage
### Example: Simulating Duck Behaviors
```java
Duck mallard = new MallardDuck();
mallard.performFly();    // Output: I'm flying with wings!
mallard.performQuack();  // Output: Quack!

// Dynamically changing behavior
mallard.setFlyBehavior(new FlyNoWay());
mallard.performFly();    // Output: I can't fly.
```

### Output:
```
I'm flying with wings!
Quack!
I can't fly.
```

---

## Design Principles Applied
1. **Encapsulate what varies**: Fly and quack behaviors are encapsulated into separate classes.
2. **Favor composition over inheritance**: Ducks use HAS-A relationship for behaviors instead of extending behavior classes.
3. **Program to interfaces, not implementations**: Ducks depend on abstract behavior interfaces (`FlyBehavior` and `QuackBehavior`).

---

## Extending the Code
You can add new behaviors or duck types easily:
1. Create a new behavior class implementing `FlyBehavior` or `QuackBehavior`.
2. Set the new behavior dynamically using `setFlyBehavior` or `setQuackBehavior`.

---

Feel free to use and extend this example in your projects! Suggestions and improvements are always welcome.

