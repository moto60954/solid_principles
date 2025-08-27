package org.solid.dip.good;

// Abstraction
public interface Switchable {
    void turnOn();
    void turnOff();
}

// Low-level module 1
class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb switched on.");
    }
    @Override
    public void turnOff() {
        System.out.println("LightBulb switched off.");
    }
}

// Low-level module 2
class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan started.");
    }
    @Override
    public void turnOff() {
        System.out.println("Fan stopped.");
    }
}

// High-level module
class Switch {
    private Switchable device;
    public Switch(Switchable device) {
        this.device = device;
    }
    public void operate() {
        device.turnOn();
        // some logic
        device.turnOff();
    }
}

//write a test class to demonstrate the functionality of the code above.
class Test {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb();
        Switchable fan = new Fan();

        Switch lightSwitch = new Switch(bulb);
        Switch fanSwitch = new Switch(fan);

        lightSwitch.operate(); // Output: LightBulb switched on.
        fanSwitch.operate();   // Output: Fan switched on.
    }
}

/*
Changes Made:
1. Introduced the `Switchable` interface: This interface defines a contract for any device that can be switched on, promoting abstraction.
2. Modified `LightBulb` to implement `Switchable`: This allows `LightBulb` to be treated as a `Switchable` device.
3. Added `Fan` class implementing `Switchable`: This demonstrates that multiple devices can now be switched on using the same `Switch` class.
4. Updated `Switch` class to depend on `Switchable`: The `Switch` class now depends on the abstraction (`Switchable`) rather than a concrete implementation (`LightBulb`).
Importance:
- Adherence to the Dependency Inversion Principle (DIP): By depending on abstractions rather than concrete implementations, the code becomes more flexible and easier to maintain.
- Enhanced Extensibility: New devices can be added without modifying the `Switch` class, adhering to the Open/Closed Principle.
- Improved Testability: The `Switch` class can be easily tested with different implementations of `Switchable`, facilitating unit testing and mocking.
*/



