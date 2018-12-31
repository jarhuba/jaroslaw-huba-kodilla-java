package com.kodilla.good.patterns.Flights;

public class Application {

    public static void main(String[] args) {

        FlightSearch fs = new FlightSearch(new FlightsRepo().retrieveFlightSet());

        System.out.println("Wszystkie przyloty do " + Airport.WAW.getName() + " to: " + fs.findArrivalsTo(Airport.WAW));

        System.out.println("Wszystkie możliwe loty z " + Airport.WAW.getName() + " to: " + fs.findDestinationsFrom(Airport.WAW));

        System.out.println("Loty z jedną przesiadką - " + Airport.WAW.getName()
                + " przez " + fs.findIndirectFlightsFromTo(Airport.WAW, Airport.KAT) + " do " + Airport.KAT.getName());
    }
}
