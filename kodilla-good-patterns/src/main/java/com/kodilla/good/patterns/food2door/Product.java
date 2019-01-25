package com.kodilla.good.patterns.food2door;

public class Product {

    private String productName;
    private double productPrice;
    private Producer producer;

    public Product(String productName, double productPrice, Producer producer) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.producer = producer;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Produkt \"" + productName + "\"";
    }
}
