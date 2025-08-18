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
