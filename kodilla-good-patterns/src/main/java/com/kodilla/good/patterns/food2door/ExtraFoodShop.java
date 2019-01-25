package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop extends Producer {

    private static final String NAME = "ExtraFoodShop";

    public ExtraFoodShop() {
        super(NAME);
    }

    @Override
    public boolean process() {
        System.out.println("Przetwarzasz zamówienie do " + NAME + " i sprawdzasz dostępność.");
        return true;
    }
}
