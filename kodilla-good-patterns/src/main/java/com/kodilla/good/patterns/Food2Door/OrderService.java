package com.kodilla.good.patterns.Food2Door;

import java.util.List;
import java.util.Map;

public class OrderService {

    public static boolean processOrderForSupplier(Map<Product, Integer> productList) {
        Double sum = 0.0;
        System.out.println("Zamawiam: ");
        for (Map.Entry<Product, Integer> e : productList.entrySet()) {
            System.out.println(e.getKey().getProducer().producerName + " " + e.getKey() + " ilość: " + e.getValue());
            sum += e.getKey().getProductPrice() * e.getValue();
        }
        System.out.println("Do zapłaty " + sum);
        return true;
    }
}
