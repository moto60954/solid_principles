package org.solid;

import org.solid.model.Order;
import org.solid.model.OrderItem;
import org.solid.srp.repository.OrderRepository;
import org.solid.srp.service.EmailService;
import org.solid.srp.service.OrderCalculator;
import org.solid.srp.service.OrderProcessorSRP;
import org.solid.srp.service.OrderValidator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //  1. Create instances of the individual responsibility classes
        OrderValidator validator = new OrderValidator(); //  Responsibility: Validate order details
        OrderRepository repository = new OrderRepository(); //  Responsibility: Manage order storage
        OrderCalculator calculator = new OrderCalculator(); //  Responsibility: Calculate order totals
        EmailService emailService = new EmailService(); //  Responsibility: Send email notifications

        //  2. Create an instance of the OrderProcessorSRP, injecting the dependencies
        OrderProcessorSRP orderProcessor = new OrderProcessorSRP(validator, repository, calculator, emailService);

        //  3. Create an Order object with some sample data
        List<OrderItem> items = new ArrayList<>();
        items.add(new OrderItem("PRODUCT001", 2, 25.00));
        items.add(new OrderItem("PRODUCT002", 1, 50.00));

        Order newOrder = new Order("ORDER-12345", items, "customer@example.com");

        //  4. Process the order using the OrderProcessorSRP
        System.out.println("--- Attempting to process a valid order ---");
        orderProcessor.processOrder(newOrder);

        System.out.println("\n--- Attempting to process an invalid order (empty items) ---");
        Order invalidOrder = new Order("ORD-INVALID", new ArrayList<>(), "invalid@example.com");
        orderProcessor.processOrder(invalidOrder); // This will fail validation because the items list is empty

    }
}