# Observer Design Pattern

The Observer Design Pattern is a behavioral design pattern. It is a design pattern where one object (the Observable) keeps a list of other objects (Observers) that want to be notified when something changes. When the Observable's state changes, it sends updates to all its Observers. <br>
Example:
Imagine a weather station (Observable) that measures temperature. Several display screens (Observers) show the temperature. When the weather station detects a change, it notifies all screens to update their display. This way, all screens always show the latest temperature.

## Structure

**ObservableInterface**: Declares methods for registering, removing, and notifying observers.<br>
**ObserverInterface**: Declares the update() method.<br>
**ConcreteObservable**: Implements ObservableInterface, holds data, and notifies observers on change.<br>
**ConcreteObserver**: Implements ObserverInterface, reacts to updates.

