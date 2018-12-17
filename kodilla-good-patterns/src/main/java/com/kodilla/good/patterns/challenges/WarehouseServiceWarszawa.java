package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.basket.Basket;

public class WarehouseServiceWarszawa implements WarehouseService {

    @Override
    public void sendToUser(User user, Basket basket) {
        System.out.println("Skompletuj i wyślij" + basket + " do " + user.getName());

    }
}
