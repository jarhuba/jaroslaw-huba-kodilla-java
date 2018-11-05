package com.kodilla.rps;

import java.util.Random;

public class Player {

    private boolean human;
    private String name;
    private String rps;
    private boolean winner = false;

    public Player(boolean human, String name) {
        this.human = human;
        this.name = name;
        if (!human) {
            aiChooseRPS();
        }
    }

    public Player() {
        this.name = "remis";
    }

    public void aiChooseRPS() {
        if (!human) {
            Random rand = new Random();
            int chooseInt = rand.nextInt(3);
            if (chooseInt == 0) {
                this.rps = "rock";
            }
            if (chooseInt == 1) {
                this.rps = "paper";
            }
            if (chooseInt == 2) {
                this.rps = "scissors";
            }
        }
    }

    public boolean isHuman() {
        return human;
    }

    public String getName() {
        return name;
    }

    public String getRps() {
        return rps;
    }

    public void setRps(String rps) {
        if (!human) {
            aiChooseRPS();
        } else {
            this.rps = rps;
        }
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
}
