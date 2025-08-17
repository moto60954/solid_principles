package org.solid.lsp.bad;

abstract class TaxiService {
    abstract void bookRide(String pickupAddress, String pickupTime, String destination, String riderName);
}

class RegularTaxi extends TaxiService {
    @Override
    public void bookRide(String pickupAddress, String pickupTime, String destination, String riderName) {
        // Regular taxi booking logic
        System.out.println("Booking regular taxi for " + riderName + " from " + pickupAddress + " to " + destination + " at " + pickupTime);
    }
}

class PoolTaxi extends TaxiService {
    @Override
    public void bookRide(String pickupAddress, String pickupTime, String destination, String riderName) {
        // Pool taxi booking logic
        throw new UnsupportedOperationException();
    }
}

class TaxiServiceTest {
    public static void main(String[] args) {
        TaxiService regularTaxi = new RegularTaxi();
        regularTaxi.bookRide("24 Maple St.", "153", "ORD", "Bob");
        TaxiService poolTaxi = new PoolTaxi();
        poolTaxi.bookRide("24 Maple St.", "153", "ORD", "Alice");
    }
}

//Can you explain how this violates the Liskov Substitution Principle (LSP)?
// This code violates the Liskov Substitution Principle (LSP) because it does not ensure that objects of the derived classes (RegularTaxi and PoolTaxi) can be substituted for objects of the base class (TaxiService) without altering the correctness of the program.
// Specifically, the bookRide method in the derived classes does not adhere to the expected behavior of the base class. If a client code expects to call bookRide on a TaxiService object, it should be able to do so without needing to know whether it is dealing with a RegularTaxi or a PoolTaxi.
// If the derived classes introduce additional parameters or change the expected behavior of the method, it can lead to unexpected results or errors when substituting one for the other.
// For example, if a client code is designed to work with TaxiService and expects a certain behavior from bookRide, substituting a PoolTaxi for a RegularTaxi (or vice versa) could lead to inconsistencies or failures in the application.
// To adhere to LSP, the derived classes should ensure that they maintain the same method signature and expected behavior as defined in the base class. This means that any derived class should be able to be used interchangeably with the base class without affecting the correctness of the program.
// In this case, both RegularTaxi and PoolTaxi should implement bookRide in a way that is consistent with the expectations of the TaxiService class, ensuring that they can be used interchangeably without causing issues in the client code.
// This can be achieved by ensuring that the method signatures and behaviors are consistent across all derived classes, allowing for proper substitution without violating the Liskov Substitution Principle.
// By adhering to LSP, the code becomes more robust and maintainable, as it allows for polymorphic behavior without introducing unexpected side effects or inconsistencies in the application.
// This principle is crucial for ensuring that derived classes can be used interchangeably with their base class, promoting code reusability and flexibility in object-oriented design.
//// In summary, the violation of LSP in this code arises from the fact that the derived classes
// do not maintain the expected behavior of the base class, leading to potential issues when substituting
// one derived class for another.

