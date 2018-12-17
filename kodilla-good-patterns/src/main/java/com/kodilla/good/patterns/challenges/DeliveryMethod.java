package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.basket.Basket;

public interface DeliveryMethod {

    double calculatePriceOfDelivery(Basket basket);
}
