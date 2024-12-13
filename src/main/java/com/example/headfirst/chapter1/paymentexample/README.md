# Chapter 1: Strategy Pattern - Payment Processing Example

## Introduction to Strategy Pattern
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from the clients that use it.

In the **Payment Processing** example, we use the Strategy Pattern to handle different payment methods (e.g., Credit Card, PayPal), allowing dynamic selection of payment strategies at runtime.

---

## Package Structure
```
com.example.headfirst.chapter1.PaymentExample/
├── PaymentProcessor.java          # Context class to handle payments
├── PaymentSimulator.java          # Main class to test the payment strategies
└── strategy/
    ├── PaymentStrategy.java       # Payment strategy interface
    ├── CreditCardPayment.java     # Concrete strategy: Credit Card
    └── PayPalPayment.java         # Concrete strategy: PayPal
```

---

## Key Concepts
### Why Use the Strategy Pattern?
1. **Encapsulation of Behavior**: Payment methods are encapsulated into separate strategy classes.
2. **Flexibility**: Payment methods can be switched dynamically without modifying the context.
3. **Reusability**: Common payment behaviors can be reused across multiple systems.

### When to Use It?
- When you have multiple algorithms (e.g., different payment methods) for a specific behavior.
- When you need to dynamically change the algorithm used at runtime.
- When adding new behaviors should not impact existing code.

---

## Implementation Details
### Classes:
1. **`PaymentProcessor` (Context)**: Manages payment processing and delegates to the selected payment strategy.
2. **Concrete Strategies**:
    - **`CreditCardPayment`**: Processes payments using credit cards.
    - **`PayPalPayment`**: Processes payments using PayPal.
3. **`PaymentStrategy`**: The interface defining the contract for all payment strategies.

---

## Code Usage
### Example: Simulating Payment Methods
#### Code:
```java
PaymentProcessor processor = new PaymentProcessor();

// Use Credit Card Payment
processor.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
processor.processPayment(150.00);

// Switch to PayPal Payment
processor.setPaymentStrategy(new PayPalPayment("user@example.com"));
processor.processPayment(200.00);
```

#### Output:
```
Paid $150.0 using Credit Card (Card Number: 1234-5678-9876-5432).
Paid $200.0 using PayPal (Email: user@example.com).
```

---

## Design Principles Applied
1. **Encapsulate what varies**: Payment methods are encapsulated into separate classes.
2. **Favor composition over inheritance**: The `PaymentProcessor` class uses HAS-A relationships with payment strategies.
3. **Program to interfaces, not implementations**: The context interacts with `PaymentStrategy` instead of concrete implementations.

---

## Extending the Code
You can add new payment methods easily:
1. Create a new class implementing `PaymentStrategy` (e.g., `CryptoPayment`).
2. Set the new strategy dynamically using `setPaymentStrategy`.

#### Example:
```java
processor.setPaymentStrategy(new CryptoPayment("0xABCDEF123456789"));
processor.processPayment(500.00);
```

---

Feel free to use and extend this example in your projects! Suggestions and improvements are always welcome.

