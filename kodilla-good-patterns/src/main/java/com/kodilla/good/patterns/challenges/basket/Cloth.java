package com.kodilla.good.patterns.challenges.basket;

public class Cloth extends Product {

    private boolean buttons;
    private String material;

    public Cloth(String name, int quantity, double itemPrice, double itemDeliveryPrice, double used, boolean buttons, String material) {
        super(name, quantity, itemPrice, itemDeliveryPrice, used);
        this.buttons = buttons;
        this.material = material;
    }
}
