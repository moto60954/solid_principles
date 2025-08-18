package org.solid.isp.bad;

interface MultiFunctionDevice {
    void print();
    void scan();
    void fax();
}

class SimplePrinter implements MultiFunctionDevice {
    @Override
    public void print() {
        System.out.println("Printing document.");
    }

    @Override
    public void scan() {
        // Not supported
        throw new UnsupportedOperationException("Scan not supported.");
    }

    @Override
    public void fax() {
        // Not supported
        throw new UnsupportedOperationException("Fax not supported.");
    }
}
//Explaination: The `MultiFunctionDevice` interface forces `SimplePrinter` to implement methods it does not support, violating the Interface Segregation Principle. This leads to unnecessary complexity and potential runtime exceptions when unsupported methods are called. A better design would separate the functionalities into distinct interfaces, allowing classes to implement only what they need.
// This design violates the Interface Segregation Principle (ISP) because it forces the `SimplePrinter` class to implement methods (`scan` and `fax`) that it does not support, leading to potential runtime exceptions when those methods are called. A better approach would be to create separate interfaces for each functionality (printing, scanning, faxing) so that classes can implement only the methods they actually support.