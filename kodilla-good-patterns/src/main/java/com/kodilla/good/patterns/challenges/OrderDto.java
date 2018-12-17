package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.basket.Basket;

public class OrderDto {
    public OrderRequest orderRequest;
    public boolean isPayed;

    public OrderDto(OrderRequest orderRequest, boolean isPayed) {
        this.orderRequest = orderRequest;
        this.isPayed = isPayed;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public boolean isPayed() {
        return isPayed;
    }
}
