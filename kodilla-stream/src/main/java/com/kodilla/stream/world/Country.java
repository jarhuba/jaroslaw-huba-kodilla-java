package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal countryPeoples;

    public Country(final BigDecimal countryPeoples) {
        this.countryPeoples = countryPeoples;
    }

    public BigDecimal getPeopleQuantity() {
        return countryPeoples;
    }
}
