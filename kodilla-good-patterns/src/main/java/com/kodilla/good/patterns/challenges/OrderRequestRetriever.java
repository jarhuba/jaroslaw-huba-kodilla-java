package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.basket.Basket;

public class OrderRequestRetriever {

    public OrderRequest orderRetriever() {
        User user = new User("Jan", "Kowalski");
        Basket basket = new Basket(); //aplikacja zakupowa odpowiada za utwożenie basket
        return new OrderRequest(user, basket);
    }
}
