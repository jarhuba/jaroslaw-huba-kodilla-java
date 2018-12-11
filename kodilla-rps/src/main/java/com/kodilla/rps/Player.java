package com.kodilla.rps;

public abstract class Player {

    private final String name;
    private int points;
    private int move;

    abstract void chooseMove(Game game);

    public Player(String name) {
        this.name = name;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public int getMove() {
        return move;
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
