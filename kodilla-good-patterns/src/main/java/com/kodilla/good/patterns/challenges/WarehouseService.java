package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.basket.Basket;

public interface WarehouseService {

    void sendToUser(User user, Basket basket);
}
