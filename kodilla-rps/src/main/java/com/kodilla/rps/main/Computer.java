package com.kodilla.rps.main;

import java.util.Random;

public class Computer {

    private String rps;
    private String name = "computer";

    public Computer() {

    }

    public void setRps() {
        Random rand = new Random();
        int chooseInt = rand.nextInt(5);
        if (chooseInt == 0) {
            this.rps = "paper";
        }
        if (chooseInt == 1) {
            this.rps = "rock";
        }
        if (chooseInt == 2) {
            this.rps = "scissors";
        }
        if (chooseInt == 3) {
            this.rps = "spock";
        }
        if (chooseInt == 4) {
            this.rps = "lizard";
        }
    }

    public String getRps() {
        return rps;
    }

    public String getName() {
        return name;
    }
}
