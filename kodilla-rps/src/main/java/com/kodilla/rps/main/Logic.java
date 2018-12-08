package com.kodilla.rps.main;

public class Logic {

    private String humanGesture;
    private String computerGesture;
    private String paper = "paper";
    private String rock = "rock";
    private String scissors = "scissors";
    private String spock = "spock";
    private String lizard = "lizard";


    public Logic(Human human, Computer computer) {
        this.humanGesture = human.getRps();
        this.computerGesture = computer.getRps();
    }

    public String resoult() {
        String result = "";
        if (humanGesture.equals(computerGesture)) {
            result = "remis";
        }

        if (humanGesture.equals(paper) && computerGesture.equals(rock)) {
            result = "human";
        }

        if (humanGesture.equals(paper) && computerGesture.equals(scissors)) {
            result = "computer";
        }

        if (humanGesture.equals(paper) && computerGesture.equals(spock)) {
            result = "human";
        }

        if (humanGesture.equals(paper) && computerGesture.equals(lizard)) {
            result = "computer";
        }

        if (humanGesture == rock && computerGesture == paper) {
            result = "computer";
        }
        if (humanGesture == rock && computerGesture == scissors) {
            result = "computer";
        }

        if (humanGesture == rock && computerGesture == spock) {
            result = "human";
        }

        if (humanGesture == rock && computerGesture == lizard) {
            result = "computer";
        }

        if (humanGesture == scissors && computerGesture == paper) {
            result = "computer";
        }

        if (humanGesture == scissors && computerGesture == rock) {
            result = "computer";
        }

        if (humanGesture == scissors && computerGesture == spock) {
            result = "computer";
        }

        if (humanGesture == scissors && computerGesture == lizard) {
            result = "computer";
        }

        if (humanGesture == spock && computerGesture == paper) {
            result = "computer";
        }

        if (humanGesture == spock && computerGesture == rock) {
            result = "computer";
        }

        if (humanGesture == spock && computerGesture == scissors) {
            result = "computer";
        }

        if (humanGesture == spock && computerGesture == lizard) {
            result = "computer";
        }

        if (humanGesture == lizard && computerGesture == paper) {
            result = "computer";
        }

        if (humanGesture == lizard && computerGesture == rock) {
            result = "computer";
        }

        if (humanGesture == lizard && computerGesture == scissors) {
            result = "computer";
        }

        if (humanGesture == lizard && computerGesture == spock) {
            result = "computer";
        }

        return result;
    }
}
