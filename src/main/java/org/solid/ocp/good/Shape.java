package org.solid.ocp.good;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

//create main method to demonstrate the usage
class TestAreaCalculator {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Area of Rectangle: " + areaCalculator.calculateArea(rectangle));
        System.out.println("Area of Circle: " + areaCalculator.calculateArea(circle));
    }
}

//Why there is need of AreaCalculator class?
// The AreaCalculator class serves as a utility to calculate the area of different shapes without needing to
// know the specifics of each shape's implementation. This adheres to the Open/Closed Principle (OCP) by allowing new shapes to be added
// without modifying the AreaCalculator class.
// If a new shape is introduced, such as a Triangle, it can implement the Shape interface and provide its own
// implementation of the calculateArea method. The AreaCalculator class remains unchanged,
// demonstrating the principle of open for extension but closed for modification.
// This design promotes flexibility and scalability in the codebase, allowing for easy addition of new shapes
// while keeping the area calculation logic centralized and consistent.
// The benefits of this design include:
// 1. **Extensibility**: New shapes can be added without modifying existing code, adhering to the Open/Closed Principle.
// 2. **Maintainability**: Each shape's area calculation logic is encapsulated within its own class, making it easier to maintain and test.
// 3. **Single Responsibility**: Each class has a single responsibility, making the codebase cleaner and easier to understand.
// 4. **Reusability**: The AreaCalculator can be reused across different parts of the application without needing to know the details of each shape.
// 5. **Polymorphism**: The use of the Shape interface allows for polymorphic behavior, enabling the AreaCalculator to work with any shape that implements the interface, promoting code reuse and flexibility.
// Overall, this design adheres to the SOLID principles, particularly the Open/Closed Principle, and enhances the code's modularity, maintainability, and testability. It allows developers to
// easily extend the functionality of the application by adding new shapes without affecting existing code, thus reducing the risk of introducing bugs and improving the overall quality of the codebase.
// This approach also makes it easier to implement unit tests for each shape's area calculation logic,
// as each shape can be tested independently, ensuring that the area calculation is correct for each specific shape.
// Additionally, the AreaCalculator can be tested separately to ensure it correctly calculates the area for any shape that implements the Shape interface.
// This separation of concerns and adherence to SOLID principles leads to a more robust and maintainable codebase, allowing for easier future enhancements and modifications.
// Overall, the design promotes a clean architecture that is easy to understand, maintain, and extend,
// while also ensuring that the code remains flexible and adaptable to future requirements.
// By following these principles, developers can create a codebase that is not only functional but also adheres to best practices in software design,
// making it easier to collaborate, test, and evolve the application over time.
// This approach ultimately leads to a more sustainable and scalable codebase that can adapt to changing requirements and new features without becoming overly complex or difficult to manage.
// This design also allows for better separation of concerns, as each shape class is responsible for its
// own area calculation logic, while the AreaCalculator class focuses solely on calculating the area of any shape.
// This separation makes the code easier to read, understand, and maintain, as each class has a clear and distinct purpose.
// It also allows for easier unit testing, as each shape can be tested independently for its area calculation logic,
// while the AreaCalculator can be tested to ensure it correctly interacts with the Shape interface.
// This modular approach enhances the overall quality of the codebase, making it more robust
//Is AreaCalculator not a violation of SRP ?
// The AreaCalculator class is not a violation of the Single Responsibility Principle (SRP) because its sole responsibility is to calculate the area of shapes.
// It does not manage shape data or perform any other unrelated tasks. The SRP states that a class should have only one reason to change, meaning it should only have one responsibility.
// In this case, the AreaCalculator's responsibility is clearly defined: to provide a method for calculating the area of any shape that implements the Shape interface.
// If the area calculation logic were to change, only the AreaCalculator class would need to be modified, without affecting the individual shape classes.
// This design adheres to the SRP by keeping the area calculation logic separate from the shape definitions, allowing for a clean and modular codebase.
// Each shape class (Rectangle, Circle, etc.) is responsible for its own area calculation logic, while the AreaCalculator serves as a utility to perform area calculations on any shape that implements the Shape interface.
// This separation of concerns enhances maintainability, testability, and readability of the code