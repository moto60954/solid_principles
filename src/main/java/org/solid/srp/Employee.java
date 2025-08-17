package org.solid.srp;

public class Employee {
    private String name;
    private double salary;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}

class SalaryCalculator {
    public double calculateAnnualSalary(Employee employee) {
        return employee.getSalary() * 12;
    }
}

class EmployeeRepository {
    public void save(Employee employee) {
        // Database save logic
    }
}

class EmployeeReportGenerator {
    public void generateReport(Employee employee) {
        // Report generation logic
    }
}

// This design follows the Single Responsibility Principle (SRP):
// - Employee manages employee data.
// - SalaryCalculator handles salary calculations.
// - EmployeeRepository saves employee data.
// - EmployeeReportGenerator generates reports.
// Each class has one responsibility, making the code modular, maintainable, and testable.
//benefits of this design include:
// 1. **Modularity**: Each class has a single responsibility, making it easier
//    to understand and maintain.
// 2. **Testability**: Each class can be tested independently, allowing for more
//    focused unit tests.
// 3. **Maintainability**: Changes in one class do not affect others, reducing
//    the risk of introducing bugs.
// 4. **Reusability**: Classes can be reused in different contexts without
//    bringing along unrelated functionality.