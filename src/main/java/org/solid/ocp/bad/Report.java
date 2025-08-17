package org.solid.ocp.bad;

public class Report {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        generator.generateReport("web", "Web Report Data");
        generator.generateReport("print", "Print Report Data");
        generator.generateReport("pdf", "PDF Report Data");
        generator.generateReport("excel", "Excel Report Data"); // Unsupported type
    }
}

class ReportGenerator {
    public void generateReport(String type, String data) {
        if (type.equalsIgnoreCase("web")) {
            System.out.println("Generating Web Report: " + data);
            // Web report logic
        } else if (type.equalsIgnoreCase("print")) {
            System.out.println("Generating Print Report: " + data);
            // Print report logic
        } else if (type.equalsIgnoreCase("pdf")) {
            System.out.println("Generating PDF Report: " + data);
            // PDF report logic
        } else {
            System.out.println("Unsupported report type");
        }
    }
}

// This code violates the Open/Closed Principle by requiring modification of the ReportGenerator class
// whenever a new report type is added. It uses a series of if-else statements to
// determine the type of report to generate, which makes it difficult to extend the functionality
// without changing the existing code. This can lead to bugs and makes the code harder to maintain
// and test. A better approach would be to use polymorphism or a strategy pattern to handle
// different report types without modifying the ReportGenerator class.
// This example demonstrates a bad implementation of the Open/Closed Principle in Java.
// The ReportGenerator class is not open for extension and requires modification
// whenever a new report type is added. This violates the principle that classes should be open for
// extension but closed for modification. The use of if-else statements to determine the report type
// makes it difficult to add new report types without changing the existing code, leading to potential bugs
// and making the code harder to maintain and test. A better approach would be to use polymorphism or a strategy pattern to handle different report types without modifying the ReportGenerator class.
// This example demonstrates a bad implementation of the Open/Closed Principle in Java.
