package org.solid.ocp.good;

// Common interface for all report types
interface Report {
    void generate(String data);
}

// Web report implementation
class WebReport implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generating Web Report: " + data);
        // Web report logic
    }
}

// Print report implementation
class PrintReport implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generating Print Report: " + data);
        // Print report logic
    }
}

// PDF report implementation
class PDFReport implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generating PDF Report: " + data);
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
        generator.generateReport(new WebReport(), "Web Report Data");
        generator.generateReport(new PrintReport(), "Print Report Data");
        generator.generateReport(new PDFReport(), "PDF Report Data");
    }
}

