package org.solid.dip.bad;

// High-level module
public class Switch {
    private LightBulb bulb;
    public Switch(LightBulb bulb) { this.bulb = bulb; }
    public void operate() { bulb.turnOn(); }
}

// Low-level module
class LightBulb {
    public void turnOn() { System.out.println("LightBulb switched on."); }
}

class Test {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        Switch lightSwitch = new Switch(bulb);
        lightSwitch.operate(); // Output: LightBulb switched on.
    }
}

/*
High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.
The above code violates the Dependency Inversion Principle (DIP) because the `Switch` class depends on the concrete `LightBulb` class rather than an abstraction. This makes it difficult to extend the functionality to other devices without modifying the `Switch` class. It also makes testing harder, as you cannot easily substitute `LightBulb` with a mock or another implementation.
To adhere to DIP, we should introduce an interface (e.g., `Switchable`) that `LightBulb` implements, and then have `Switch` depend on that interface instead of the concrete class. This way, `Switch` can work with any device that implements the `Switchable` interface, promoting flexibility and maintainability.
*/