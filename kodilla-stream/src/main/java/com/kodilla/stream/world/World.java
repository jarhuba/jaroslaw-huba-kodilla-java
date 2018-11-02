package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> world = new ArrayList<>();

    public void addContinent(Continent continent) {
        this.world.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return world.stream()
                .flatMap(continent -> continent.getContinentCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}
