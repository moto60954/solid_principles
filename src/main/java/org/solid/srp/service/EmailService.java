package org.solid.srp.service;

import org.solid.model.Order;

public class EmailService {
    public void sendOrderConfirmation(Order order) {
        //  Handles sending email notifications
        System.out.println("Sending order confirmation email to " + order.getCustomerEmail() + " for order " + order.getOrderId());
        //  Actual email sending logic
    }

}
