package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.basket.Basket;
import com.kodilla.good.patterns.challenges.basket.Product;

public class DeliveryMethodPost implements DeliveryMethod {

    @Override
    public double calculatePriceOfDelivery(Basket basket) {
        double finalPriceOfDelivery = 0;
        for (Product product : basket.getBasket()) {
            finalPriceOfDelivery = product.getItemDeliveryPrice() * product.getQuantity();
            finalPriceOfDelivery = +finalPriceOfDelivery;
        }
        return finalPriceOfDelivery;
    }
}
