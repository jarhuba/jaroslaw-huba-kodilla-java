package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.basket.Basket;

public class PaymentServceInternetBanking implements PaymentServce {

    @Override
    public boolean process(Basket basket) {
        boolean finishedOk = false;
        double toPay = basket.calculateValue();
        System.out.println("Zapłać za pomocą Blika itp " + toPay);
        System.out.println("Płatność potwierdzona");
        finishedOk = true;

        if (finishedOk) {
            return true;
        } else {
            return false;
        }
    }
}
