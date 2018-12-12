package com.kodilla.rps;

public class Player {

    private final String name;
    private int points;
    private boolean computer;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPoint() {
        points++;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isComputer() {
        return computer;
    }

    public void setComputer(boolean computer) {
        this.computer = computer;
    }
}
