package org.solid.srp.service;

import org.solid.model.Order;
import org.solid.model.OrderItem;

public class OrderCalculator {
    public double calculateTotalAmount(Order order) {
        double total = 0;
        for (OrderItem item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        //  Apply business rules for discounts, taxes, shipping
        return total * 1.05; //  Adding a simplified tax
    }
}
