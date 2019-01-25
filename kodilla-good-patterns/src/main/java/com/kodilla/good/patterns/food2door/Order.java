package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<Product, Integer> order = new HashMap<>();

    public void addProductToOrder(Product product, int orderedQuantity) {
        order.put(product, orderedQuantity);
    }

    public Map getOrderList() {
        return order;
    }
}
