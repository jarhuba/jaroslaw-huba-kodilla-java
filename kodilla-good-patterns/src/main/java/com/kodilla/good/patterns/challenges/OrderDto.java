package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public OrderRequest orderRequest;
    public boolean isPayed;
    public boolean ordered;

    public OrderDto(OrderRequest orderRequest, boolean isPayed, boolean ordered) {
        this.orderRequest = orderRequest;
        this.isPayed = isPayed;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public boolean isOrdered() {
        return ordered;
    }
}
