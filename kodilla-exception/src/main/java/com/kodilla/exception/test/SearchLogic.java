package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchLogic {

    public String findFilght(Flight flight) throws RouteNotFounException {
        String toDisplay = "Checking " + flight + " \n";

        Map<String, Boolean> mapArrivalAirports = new HashMap<>();
        mapArrivalAirports.put("Warszawa", false);
        mapArrivalAirports.put("London", true);
        mapArrivalAirports.put("New York", true);
        mapArrivalAirports.put("Berlin", false);

        if (mapArrivalAirports.get(flight.getArrivalAirport()) == null) {
            throw new RouteNotFounException("Nie ma takiego lotniska docelowego, lepiej nie startuj do " + flight.getArrivalAirport() + "!!!");
        }

        boolean myDepatureAirportWorking = false;
        boolean arrivalAirportWorking = false;
        boolean bothAirportsWorking = false;
        for (Map.Entry entry : mapArrivalAirports.entrySet()) {
            if (flight.getDepartureAirport() == entry.getKey()) {
                myDepatureAirportWorking = (boolean) entry.getValue();
            }
        }

        for (Map.Entry entry : mapArrivalAirports.entrySet()) {
            arrivalAirportWorking = (boolean) entry.getValue();
            bothAirportsWorking = myDepatureAirportWorking && arrivalAirportWorking;

            if ((flight.getArrivalAirport()) == entry.getKey() && flight.getDepartureAirport() == entry.getKey()) {
                toDisplay += "Jesteś na lotnisku docelowym " + flight.getDepartureAirport();
            } else if (flight.getArrivalAirport() == entry.getKey() && flight.getDepartureAirport() != entry.getKey() && bothAirportsWorking) {
                toDisplay += "Możesz lecieć do " + entry.getKey();
            } else if (flight.getArrivalAirport() == entry.getKey() && !bothAirportsWorking) {
                toDisplay += "Nie możesz lecieć do " + flight.getArrivalAirport() + ", lotnisko jest nieczynne (lub dwa lotniska nieczynne)";
            }
        }
        return toDisplay + "\n";
    }

    public static void main(String[] args) {
        SearchLogic searchLogic = new SearchLogic();
        Flight flight0 = new Flight("Warszawa", "Warszawa");
        Flight flight1 = new Flight("Warszawa", "London");
        Flight flight2 = new Flight("Warszawa", "New York");
        Flight flight3 = new Flight("Warszawa", "Berlin");
        Flight flight4 = new Flight("Berlin", "Warszawa");
        Flight flight5 = new Flight("New York", "London");
        Flight flight6 = new Flight("Warszawa", "San Escobar");

        try {
            System.out.println(searchLogic.findFilght(flight0));
            System.out.println(searchLogic.findFilght(flight1));
            System.out.println(searchLogic.findFilght(flight2));
            System.out.println(searchLogic.findFilght(flight3));
            System.out.println(searchLogic.findFilght(flight4));
            System.out.println(searchLogic.findFilght(flight5));
            System.out.println(searchLogic.findFilght(flight6));
        } catch (RouteNotFounException e) {
            System.out.println(e.getMessage());
        }
    }
}
