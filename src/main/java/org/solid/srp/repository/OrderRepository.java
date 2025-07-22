package org.solid.srp.repository;

import org.solid.model.Order;

public class OrderRepository {
    public void saveOrder(Order order) {
        //  Handles database interactions for saving orders
        System.out.println("Saving order " + order.getOrderId() + " to the database.");
        //  Actual database saving logic
    }
}
