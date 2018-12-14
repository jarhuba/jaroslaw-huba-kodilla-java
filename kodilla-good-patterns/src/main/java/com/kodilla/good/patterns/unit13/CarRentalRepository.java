package com.kodilla.good.patterns.unit13;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {

    @Override
    public void createRental(User user, LocalDateTime rentFrom, LocalDateTime rentTo) {
        System.out.println("Car repository...");
    }
}
