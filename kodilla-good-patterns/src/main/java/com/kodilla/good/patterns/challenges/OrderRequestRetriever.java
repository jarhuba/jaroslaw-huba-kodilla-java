package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

public OrderRequest retriever() {
    User user = new User("Jan", "Kowalski");
    Basket basket = new Basket(lista produktów);
    DeliveryMethod deliveryMethod = new DeliveryMethodPost();
    deliveryMethod.calculatePrice(basket);
    return new OrderRequest();
}
}
