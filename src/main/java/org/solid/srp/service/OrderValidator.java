package org.solid.srp.service;

import org.solid.model.Order;

public class OrderValidator {
    public boolean isValidOrder(Order order) {
        //  Specific order validation logic
        if (order.getItems().isEmpty()) {
            System.out.println("Order must have at least one item.");
            return false;
        }
        //  Additional validation, e.g., checking stock availability, customer details
        return true;
    }
}
