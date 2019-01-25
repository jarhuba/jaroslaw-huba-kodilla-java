package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop extends Producer {

    private static final String NAME = "GlutenFreeShop";

    public GlutenFreeShop() {
        super(NAME);
    }

    @Override
    public boolean process() {
        System.out.println("Przetwarzasz zamówienie do " + NAME + " i sprawdzasz dostępność.");
        return true;
    }
}
