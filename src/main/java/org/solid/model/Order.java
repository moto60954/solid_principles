package org.solid.model;

import java.util.List;

public class Order {
    private String orderId;
    private List<OrderItem> items;
    private String customerEmail;

    //  Constructor, getters, setters
    public Order(String orderId, List<OrderItem> items, String customerEmail) {
        this.orderId = orderId;
        this.items = items;
        this.customerEmail = customerEmail;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
