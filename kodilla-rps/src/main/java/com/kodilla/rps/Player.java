package com.kodilla.rps;

public abstract class Player {

    private final String name;
    private int points;

    abstract int getMove();

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
}
