package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private Basket basket;
    private DeliveryMethod deliveryMethod;

    public OrderRequest(User user, Basket basket, DeliveryMethod deliveryMethod) {
        this.user = user;
        this.basket = basket;
        this.deliveryMethod = deliveryMethod;
    }
}
}
