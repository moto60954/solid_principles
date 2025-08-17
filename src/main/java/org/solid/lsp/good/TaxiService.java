package org.solid.lsp.good;

abstract class TaxiService {
    abstract void bookRide(String pickupAddress, String pickupTime, String destination, String riderName);
}

class RegularTaxi extends TaxiService {
    @Override
    public void bookRide(String pickupAddress, String pickupTime, String destination, String riderName) {
        // Regular taxi booking logic
        // Maybe send an API call:
        // purplecab.com/regular/Bob/pickupAddress/24 Maple St./pickupTime/153/destination/ORD
        System.out.println("Booking regular taxi for " + riderName + " from " + pickupAddress + " to " + destination + " at " + pickupTime);
    }
}

class PoolTaxi extends TaxiService {
    @Override
    public void bookRide(String pickupAddress, String pickupTime, String destination, String riderName) {
        // Pool taxi booking logic
        // Maybe send an API call:
        // purplecab.com/pool/Bob/pickupAddress/24 Maple St./pickupTime/153/destination/ORD
        System.out.println("Booking pool taxi for " + riderName + " from " + pickupAddress + " to " + destination + " at " + pickupTime);
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