package org.solid.ocp.good;

// Common interface for all report types
interface Report {
    void generate(String data);
}

// Web report implementation
class WebReportStrategy implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generating Web Report: " + data);
        // Web report logic
    }
}

// Print report implementation
class PrintReportStrategy implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generating Print Report: " + data);
        // Print report logic
    }
}

// PDF report implementation
class PDFReportStrategy implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generating PDF Report: " + data);
        // PDF report logic
    }
}

class CSVReportStrategy implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generating csv Report: " + data);
        // PDF report logic
    }
}

// A generator that can use any report implementation
class ReportGenerator {
    public void generateReport(Report report, String data) {
        report.generate(data);
    }
}

// Usage Example:
class TestReportGenerator {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        generator.generateReport(new WebReportStrategy(), "Web Report Data");
        generator.generateReport(new PrintReportStrategy(), "Print Report Data");
        generator.generateReport(new PDFReportStrategy(), "PDF Report Data");
        generator.generateReport(new CSVReportStrategy(), "CSV Report Data");
    }
}

//Can you explain strategy pattern in this code?
// The strategy pattern is a behavioral design pattern that enables selecting an algorithm at runtime.
// In this code, the strategy pattern is implemented through the `Report` interface and its concrete implementations (`WebReportStrategy`, `PrintReportStrategy`, and `PDFReportStrategy`).
// Each concrete class encapsulates a specific report generation algorithm.
// The `ReportGenerator` class uses the `Report` interface to generate reports without needing to know the details of how each report type is generated.
// This allows for easy extension of new report types without modifying the existing code, adhering to the Open/Closed Principle.
// By using the strategy pattern, the code becomes more modular, maintainable, and flexible, allowing new report types to be added simply by creating new classes that implement the `Report` interface.
//// This design promotes separation of concerns, as each report type is responsible for its own generation logic,
// making the codebase cleaner and easier to manage.
// The `ReportGenerator` class can work with any implementation of the `Report` interface,
// allowing for dynamic behavior based on the report type passed to it.
// This approach enhances code readability and maintainability, as each report type can be modified or extended independently
// without affecting the `ReportGenerator` class or other report types.
// Overall, the strategy pattern in this code provides a flexible and extensible way to handle different report generation strategies,
// promoting adherence to the Open/Closed Principle and improving the overall design of the application.
// This design allows for easy addition of new report types without modifying existing code,
// making it easier to maintain and extend the application in the future.
// The strategy pattern is particularly useful in scenarios where multiple algorithms or behaviors can be applied,
// and it allows for cleaner code by encapsulating each behavior in its own class.
// This approach enhances code readability, maintainability, and testability,
// aligning with the principles of object-oriented design and SOLID principles.
// By using the strategy pattern, the code adheres to the Open/Closed Principle,
// allowing the `ReportGenerator` class to remain closed for modification while being open for extension.
// This means that new report types can be added without changing the existing code,
// making the system more robust and easier to evolve over time.
// The strategy pattern also promotes the use of interfaces, which allows for better abstraction and decoupling of components.
// Each report type can be tested independently, and the `ReportGenerator` can be tested with different report strategies,
// ensuring that the overall system behaves correctly regardless of the specific report type being used.
// This design pattern is widely used in software development to create flexible and maintainable systems,
// and it is particularly effective in scenarios where behavior can vary based on context or configuration.
// By encapsulating the report generation logic in separate classes,
// the code becomes more modular and easier to understand, making it a good example of applying the strategy pattern in practice.
