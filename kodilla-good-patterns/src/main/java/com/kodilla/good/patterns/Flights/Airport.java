package com.kodilla.good.patterns.Flights;

public enum Airport {
    WAW("Warszawa"), GDN("Gdańsk"), KRK("Kraków"), KAT("Katowice"), WRO("Wrocław");

    private String name;

    Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
