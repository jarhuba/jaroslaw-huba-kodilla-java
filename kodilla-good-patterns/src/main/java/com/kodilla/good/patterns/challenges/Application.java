package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever OrderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = OrderRequestRetriever.orderRetriever();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationServiceElectronicMail(), new PaymentServceInternetBanking(), new ProductOrderService(), new WarehouseServiceImpl());
        orderProcessor.process(orderRequest);
    }
}
