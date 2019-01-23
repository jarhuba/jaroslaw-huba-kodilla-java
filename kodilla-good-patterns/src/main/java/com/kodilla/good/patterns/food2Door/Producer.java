package com.kodilla.good.patterns.food2Door;

import java.util.Map;
import java.util.stream.Collectors;

public class Producer {

    String producerName;

    public Producer(String producerName) {
        this.producerName = producerName;
    }

    public boolean process(Order order) {
        specificProcess();

        Map<Product, Integer> productsList = order.getOrder();
        productsList = productsList.entrySet().stream()
                .filter(e -> e.getKey().getProducer().getProducerName().equals(this.producerName))
                .collect(Collectors.toMap(x -> x.getKey(), y -> y.getValue()));

        return OrderService.processOrderForSupplier(productsList);
    }

    public void specificProcess() {
    };

    public String getProducerName() {
        return producerName;
    }
}