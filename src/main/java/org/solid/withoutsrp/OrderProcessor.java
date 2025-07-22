package org.solid.withoutsrp;

import org.solid.model.Order;
import org.solid.model.OrderItem;

class OrderProcessor {
    public void processOrder(Order order) {
        //  Responsibility 1: Validate order details
        if (!isValidOrder(order)) {
            System.out.println("Invalid order details.");
            return;
        }

        //  Responsibility 2: Save order to the database
        saveOrderToDatabase(order);

        //  Responsibility 3: Calculate total amount
        double totalAmount = calculateTotalAmount(order);
        System.out.println("Order total: $" + totalAmount);

        //  Responsibility 4: Send order confirmation email
        sendOrderConfirmationEmail(order);
    }

    private boolean isValidOrder(Order order) {
        //  Simulated validation logic
        if (order.getItems().isEmpty()) {
            return false;
        }
        //  More complex validation rules (e.g., stock availability, valid payment info)
        return true;
    }

    private void saveOrderToDatabase(Order order) {
        //  Simulated database interaction
        System.out.println("Saving order to database: " + order.getOrderId());
        //  Actual database logic would involve SQL queries or ORM operations
    }

    private double calculateTotalAmount(Order order) {
        double total = 0;
        for (OrderItem item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        //  Apply discounts, taxes, shipping costs
        return total;
    }

    private void sendOrderConfirmationEmail(Order order) {
        //  Simulated email sending
        System.out.println("Sending order confirmation email for order: " + order.getOrderId());
        //  Actual email sending with SMTP server details
    }
}
