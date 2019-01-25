package com.kodilla.good.patterns.food2door;

import java.util.Comparator;
import java.util.Map;

public class InformationService {

    public void sendConfirmationBegin() {
        System.out.println("Złożono zamówienie.");
    }

    public void sendConfirmationEnd(Map<Product, Integer> productListBuyed, Map<Product, Integer> productListMissed) {
        System.out.println("\nZamówiono poniższe:");

        productListBuyed.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getKey().getProducer().getProducerName()))
                .forEach(e -> System.out.println(e.getKey().getProducer().getProducerName() + " " + e.getKey().getProductName() + " w ilości: " + e.getValue()));

        System.out.println("Zamówienie zrealizowano.");

        System.out.println("\nProdukty odrzucone z zamówienia:");
        productListMissed.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getKey().getProducer().getProducerName()))
                .forEach(e -> System.out.println(e.getKey().getProducer().getProducerName() + " " + e.getKey().getProductName() + " w ilości: " + e.getValue()));
    }
}
