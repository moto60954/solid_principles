package org.solid.srp.bad;

class Employee {
    private String name;
    private double salary;

    // Responsibility 1: Employee data management
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    // Responsibility 2: Salary calculation
    public double calculateSalary() { return salary * 12; }

    // Responsibility 3: Database operations
    public void saveToDatabase() {
        // Database save logic
    }

    // Responsibility 4: Report generation
    public void generateReport() {
        // Report generation logic
    }
}







// This class violates the Single Responsibility Principle (SRP) because it has multiple responsibilities:
// 1. Managing employee data (name and salary).
// 2. Calculating the salary.
// 3. Saving employee data to a database.
// 4. Generating reports for the employee.
// Each of these responsibilities should ideally be handled by separate classes to adhere to SRP.
// This design makes the Employee class harder to maintain and test, as changes in one responsibility can affect others.
// It also violates the principle of separation of concerns, making the code less modular and harder to understand.
// In a well-designed system, each class should have a single responsibility, making it easier to manage and extend the codebase.
// For example, you could create separate classes for salary calculation,
// database operations, and report generation, each handling its own specific responsibility.
// This would lead to a cleaner, more maintainable design that adheres to the Single Responsibility Principle (SRP).
// By separating these concerns, you can modify or extend each functionality independently without affecting the others.
// This approach enhances code readability, maintainability, and testability, aligning with the principles of object-oriented design and SOLID principles.