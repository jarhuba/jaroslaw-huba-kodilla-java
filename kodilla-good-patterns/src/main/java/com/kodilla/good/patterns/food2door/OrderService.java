package com.kodilla.good.patterns.food2door;

import java.util.*;

public final class OrderService {

    private final InformationService informationService;
    private double sumToPay = 0.0;

    public OrderService(final InformationService informationService) {
        this.informationService = informationService;
    }

    public void processOrderForSupplier(final Order order) {
        informationService.sendConfirmationBegin();

        Map<Product, Integer> productListDemanded = order.getOrderList();
        Map<Product, Integer> productListBuyed = new HashMap<>();
        Map<Product, Integer> productListMissed = new HashMap<>();
        //double sumToPay = 0.0;

        System.out.println("Zamawiam: ");

        productListDemanded.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getKey().getProducer().getProducerName()))
                .filter(e -> {
                    if (e.getKey().getProducer().process()) {
                        sumToPay += e.getKey().getProductPrice() * e.getValue();
                        System.out.println("Zamówiono produkt: " + e.getKey().getProductName() + " w ilości " + e.getValue() + "\n");
                        return true;
                    } else {
                        System.out.println("Brak produktu: " + e.getKey().getProductName() + " w ilości " + e.getValue());
                        productListMissed.put(e.getKey(), e.getValue());
                        return false;
                    }
                })
                .forEach(e -> productListBuyed.put(e.getKey(), e.getValue()));
        System.out.println("Do zapłaty " + sumToPay);
        informationService.sendConfirmationEnd(productListBuyed, productListMissed);
    }
}
