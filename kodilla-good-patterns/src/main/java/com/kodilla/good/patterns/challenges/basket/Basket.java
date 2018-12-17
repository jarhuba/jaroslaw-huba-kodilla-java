package com.kodilla.good.patterns.challenges.basket;

import java.util.LinkedList;

public class Basket {

    private LinkedList<Product> basket;

    public Basket() {
        this.basket = new LinkedList<>();
    }

    public LinkedList<Product> getBasket() {
        return basket;
    }

    public void addProductToBasket(Product product) {
        this.basket.add(product);
    }

    public double calculateValue() {
        double value = 0;
        for (Product product : basket) {
            value = + (product.getItemPrice() + product.getItemDeliveryPrice()) * product.getQuantity();
        }
        return value;
    }
}
