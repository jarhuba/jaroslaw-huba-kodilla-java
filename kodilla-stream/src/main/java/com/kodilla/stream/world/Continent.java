package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> continentCountries = new ArrayList<>();

    public void addCountry(Country country) {
        this.continentCountries.add(country);
    }

    public List<Country> getContinentCountries() {
        return continentCountries;
    }
}
