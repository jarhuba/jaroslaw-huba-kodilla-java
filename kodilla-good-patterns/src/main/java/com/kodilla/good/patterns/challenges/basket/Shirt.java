package com.kodilla.good.patterns.challenges.basket;

public class Shirt extends Cloth {

    private boolean tShirt;
    private SizeClothShirt sizeClothShirt;

    public Shirt(String name, int quantity, double itemPrice, double itemDeliveryPrice, double used, boolean buttons, String material, boolean tShirt, SizeClothShirt sizeClothShirt) {
        super(name, quantity, itemPrice, itemDeliveryPrice, used, buttons, material);
        this.tShirt = tShirt;
        this.sizeClothShirt = sizeClothShirt;
    }
}
