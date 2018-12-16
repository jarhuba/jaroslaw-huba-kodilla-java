package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever OrderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = OrderRequestRetriever.request();


    }
}
