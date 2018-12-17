package com.kodilla.good.patterns.challenges.basket;

public class Product {

    private String name;
    private int quantity;
    private double itemPrice;
    private double itemDeliveryPrice;
    private double used;

    public Product(String name, int quantity, double itemPrice, double itemDeliveryPrice, double used) {
        this.name = name;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
        this.itemDeliveryPrice = itemDeliveryPrice;
        this.used = used;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getItemDeliveryPrice() {
        return itemDeliveryPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUsed() {
        return used;
    }
}
