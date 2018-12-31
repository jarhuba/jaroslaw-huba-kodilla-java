package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class FlightSearch {

    HashSet<Flight> flightDataBase;

    public FlightSearch(HashSet<Flight> flightDataBase) {
        this.flightDataBase = flightDataBase;
    }

    public ArrayList<String> findDestinationsFrom(Airport airport) {
        ArrayList<String> foundFlights;

        foundFlights = this.flightDataBase.stream()
                .filter(f -> f.getAirportFrom().equals(airport))
                .map(f -> f.getAirportTo().getName())
                .collect(Collectors.toCollection(ArrayList::new));
        return foundFlights;
    }

    public ArrayList<String> findArrivalsTo(Airport airport) {
        ArrayList<String> foundFlights;

        foundFlights = this.flightDataBase.stream()
                .filter(f -> f.getAirportTo().equals(airport))
                .map(f -> f.getAirportFrom().getName())
                .collect(Collectors.toCollection(ArrayList::new));
        return foundFlights;
    }

    public ArrayList<String> findIndirectFlightsFromTo(Airport airportSource, Airport airportDestination) {
        ArrayList<String> foundFlights = new ArrayList<>();
        ArrayList<Airport> airportsToDestination;

        airportsToDestination = this.flightDataBase.stream()
                .filter(f -> f.getAirportTo().getName().equals(airportDestination.getName()))
                .map(f -> f.getAirportFrom())
                .collect(Collectors.toCollection(ArrayList::new));

        for (Airport airport : airportsToDestination) {
            this.flightDataBase.stream()
                    .filter(f -> f.getAirportFrom().equals(airportSource) && f.getAirportTo().equals(airport))
                    .map(f -> f.getAirportTo())
                    .forEach(f -> foundFlights.add(f.getName()));
        }
        return foundFlights;
    }
}
