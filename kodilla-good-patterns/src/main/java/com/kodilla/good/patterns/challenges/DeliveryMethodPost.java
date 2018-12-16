package com.kodilla.good.patterns.challenges;

public class DeliveryMethodPost implements DeliveryMethod {

    @Override
    public double calculatePrice(Basket basket) {
        double finalPriceOfDelivery = 0;
        for (Product product : basket.getBasket()) {
            finalPriceOfDelivery = product.getPriceToDelivery();
            finalPriceOfDelivery = +finalPriceOfDelivery;
        }
        return finalPriceOfDelivery;
    }
}
