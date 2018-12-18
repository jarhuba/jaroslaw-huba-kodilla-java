package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.basket.Basket;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(Basket basket) {
        System.out.println("Sprawdzam dostępność towaru i dokonuje rezerwacji...OK");
        boolean productsAvaiable = true;
        if (productsAvaiable) {
            return true;
        } else {
            return false;
        }
    }
}
