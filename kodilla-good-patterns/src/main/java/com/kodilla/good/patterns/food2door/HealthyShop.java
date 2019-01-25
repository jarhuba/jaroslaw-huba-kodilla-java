package com.kodilla.good.patterns.food2door;

public class HealthyShop extends Producer {

    private static final String NAME = "HealthyShop";

    public HealthyShop() {
        super(NAME);
    }

    @Override
    public boolean process() {
        System.out.println("Przetwarzasz zamówienie do " + NAME);
        return true;
    }
}
