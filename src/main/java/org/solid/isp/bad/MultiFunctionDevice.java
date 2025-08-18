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
