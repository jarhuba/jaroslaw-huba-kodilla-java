package com.kodilla.good.patterns.food2door;

import java.util.*;
import java.util.concurrent.atomic.DoubleAdder;

public final class OrderService {

    private final InformationService informationService;

    public OrderService(final InformationService informationService) {
        this.informationService = informationService;
    }

    public void processOrderForSupplier(final Order order) {
        informationService.sendConfirmationBegin();

        Map<Product, Integer> productListDemanded = order.getOrderList();
        Map<Product, Integer> productListBought = new HashMap<>();
        Map<Product, Integer> productListMissed = new HashMap<>();
        DoubleAdder sumToPay = new DoubleAdder();

        System.out.println("Zamawiam: ");
        productListDemanded.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getKey().getProducer().getProducerName()))
                .forEach(e -> {
                    if (e.getKey().getProducer().process()) {
                        sumToPay.add(e.getKey().getProductPrice() * e.getValue());
                        System.out.println("Zamówiono produkt: " + e.getKey().getProductName() + " w ilości " + e.getValue() + "\n");
                        productListBought.put(e.getKey(), e.getValue());
                    } else {
                        System.out.println("Brak produktu: " + e.getKey().getProductName() + " w ilości " + e.getValue());
                        productListMissed.put(e.getKey(), e.getValue());
                    }
                });
        System.out.println("Do zapłaty " + sumToPay.doubleValue());
        informationService.sendConfirmationEnd(productListBought, productListMissed);
    }
}
