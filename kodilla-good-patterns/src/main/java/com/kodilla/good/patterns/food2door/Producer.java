package com.kodilla.good.patterns.food2door;

public abstract class Producer {

    private final String producerName;

    public Producer(String producerName) {
        this.producerName = producerName;
    }

    public abstract boolean process();

    public String getProducerName() {
        return producerName;
    }
}
