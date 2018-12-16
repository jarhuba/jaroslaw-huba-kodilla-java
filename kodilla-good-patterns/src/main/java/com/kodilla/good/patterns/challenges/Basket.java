package com.kodilla.good.patterns.challenges;

import java.util.LinkedList;

public class Basket {

    private LinkedList<Product> basket;

    public Basket(LinkedList<Product> basket) {
        this.basket = basket;
    }

    public LinkedList<Product> getBasket() {
        return basket;
    }

    public void setBasket(LinkedList<Product> basket) {
        this.basket = basket;
    }
}
