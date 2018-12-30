package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<Product, Integer> order;

    public Order() {
        this.order = new HashMap<>();
    }

    public void addProductToOrder(Product product, int orderedQuantity) {
        order.put(product, orderedQuantity);
    }

    public Map getOrder() {
        return order;
    }
}
