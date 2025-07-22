package org.solid.srp.service;

import org.solid.model.Order;
import org.solid.srp.repository.OrderRepository;

public class OrderProcessorSRP {
    private OrderValidator validator;
    private OrderRepository repository;
    private OrderCalculator calculator;
    private EmailService emailService;

    public OrderProcessorSRP(OrderValidator validator, OrderRepository repository, OrderCalculator calculator, EmailService emailService) {
        this.validator = validator;
        this.repository = repository;
        this.calculator = calculator;
        this.emailService = emailService;
    }

    public void processOrder(Order order) {
        if (!validator.isValidOrder(order)) {
            System.out.println("Order processing failed due to validation errors.");
            return;
        }

        repository.saveOrder(order);
        double totalAmount = calculator.calculateTotalAmount(order);
        System.out.println("Order total: $" + totalAmount);
        emailService.sendOrderConfirmation(order);

        System.out.println("Order " + order.getOrderId() + " processed successfully.");
    }
}
