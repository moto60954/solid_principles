package org.solid.isp.good;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing document.");
    }
}

class MultiFunctionMachine implements Printer, Scanner, Fax {
    @Override
    public void print() {
        System.out.println("Printing document.");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document.");
    }

    @Override
    public void fax() {
        System.out.println("Faxing document.");
    }
}

// This design adheres to the Interface Segregation Principle (ISP) by defining separate interfaces for each functionality: `Printer`, `Scanner`, and `Fax`. The `SimplePrinter` class implements only the `Printer` interface, while the `MultiFunctionMachine` class implements all three interfaces. This allows classes to implement only the methods they actually support, avoiding unnecessary complexity and potential runtime exceptions.
// This design allows for greater flexibility and adheres to the ISP by ensuring that classes only implement the methods they need. The `SimplePrinter` class implements only the `Printer` interface, while
// the `MultiFunctionMachine` class implements all three interfaces, allowing it to provide printing, scanning, and faxing functionalities. This way, clients can use the specific functionality they require without being forced to implement unsupported methods.
