# Decorator Pattern
The Decorator Pattern is a structural design pattern. It allows you to add new functionality to objects dynamically, without changing their structure or modifying their code. This is done by wrapping the original object with a new decorator class that adds the extra behavior.

## Why use it?
- To extend the behavior of individual objects at runtime.
- To follow the Open/Closed Principle (open for extension, closed for modification).
- To avoid creating many subclasses for every possible combination of behaviors

### Example:
Imagine a coffee shop. You have a basic coffee, but you want to add milk, sugar, or other toppings. Instead of creating a class for every combination (CoffeeWithMilkAndSugar, CoffeeWithMilk, etc.), you use decorators to add these features dynamically.

## Structure
- **Component:** Interface or abstract class for objects that can have responsibilities added.
- **ConcreteComponent:** The original object.
- **Decorator:** Abstract class that implements the component interface and has a reference to a component.
- **ConcreteDecorator:** Adds new behavior before/after delegating to the component.

