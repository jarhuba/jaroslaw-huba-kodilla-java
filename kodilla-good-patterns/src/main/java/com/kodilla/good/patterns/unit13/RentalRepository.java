package com.kodilla.good.patterns.unit13;

import java.time.LocalDateTime;

public interface RentalRepository {

    void createRental(User user, LocalDateTime rentFrom, LocalDateTime rentTo);
}
