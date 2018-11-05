package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String toDisplay = "Wynik poza logiką";

        try {
            toDisplay = secondChallenge.probablyIWillThrowException(4, 4);
        } catch (Exception e) {
            System.out.println("Złapałem błąd niedozwolonego działania z SecondChallenge: " + e);
        } finally {
            System.out.println(toDisplay);
        }
    }
}
