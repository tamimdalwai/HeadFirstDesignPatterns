# Chapter 3: Decorator Pattern - Beverage Customization and Real-World Scenarios

## Introduction to the Decorator Pattern
The **Decorator Pattern** is a structural design pattern that allows you to dynamically attach additional responsibilities or behaviors to an object. Decorators provide a flexible alternative to subclassing for extending functionality.

### Key Benefits
1. **Dynamic Extension**: Add new functionality to objects at runtime without altering their structure.
2. **Open-Closed Principle**: The pattern keeps classes open for extension but closed for modification.
3. **Composable Design**: Combine multiple decorators to create complex functionality.

---

## Package Structure
We’ll use the following structure for both the book example (Coffee Shop) and a real-world example (File Encryption):

```
com.example.headfirst.chapter3.DecoratorPattern/
├── beverages/               # Book example: Coffee Shop
│   ├── Beverage.java        # Base component interface
│   ├── Coffee.java          # Concrete component
│   ├── MilkDecorator.java   # Concrete decorator
│   ├── SugarDecorator.java  # Concrete decorator
│   └── CoffeeShop.java      # Main simulation
├── fileencryption/          # Real-world example: File Encryption
│   ├── DataSource.java      # Base component interface
│   ├── FileDataSource.java  # Concrete component
│   ├── EncryptionDecorator.java # Concrete decorator
│   ├── CompressionDecorator.java # Concrete decorator
│   └── FileEncryptionApp.java    # Main simulation
```

---

## Book Example: Coffee Shop
In this example, a coffee shop uses the Decorator Pattern to allow customers to dynamically customize their coffee (e.g., adding milk, sugar, whipped cream).

### Key Classes
1. **Beverage Interface**:
    - Defines the base contract for all beverages.
2. **Coffee**:
    - The concrete implementation of the Beverage interface.
3. **MilkDecorator and SugarDecorator**:
    - Add milk or sugar functionality to any beverage dynamically.

---

## Real-World Example: File Encryption
In this example, a file encryption system uses the Decorator Pattern to dynamically apply encryption and compression to data before saving it.

### Key Classes
1. **DataSource Interface**:
    - Abstracts the data storage.
2. **FileDataSource**:
    - A concrete implementation that reads/writes raw data.
3. **EncryptionDecorator**:
    - Dynamically encrypts the data.
4. **CompressionDecorator**:
    - Dynamically compresses the data.

---

## How to Use This Repository
1. Clone the repository:
   ```bash
   git clone https://github.com/tamimdalwai/HeadFirstDesignPatterns
   ```
2. Navigate to the Decorator Pattern examples.
3. Run the `CoffeeShop` and `FileEncryptionApp` simulations to see the Decorator Pattern in action.

---

## Design Principles Applied
1. **Classes Should Be Open for Extension, but Closed for Modification**:
    - Decorators allow you to extend functionality without modifying existing code.

2. **Favor Composition Over Inheritance**:
    - Combine decorators to dynamically add behavior.

---

Feel free to explore, enhance, and provide feedback! The Decorator Pattern is a powerful tool for creating scalable and flexible designs.

