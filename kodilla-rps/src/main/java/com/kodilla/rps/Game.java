package com.kodilla.rps;

public abstract class Game {

    private int roundCount;
    private int roundNumber;
    private int gameType;

    abstract String gameName();

    abstract Player whoWinsRound(Player player1, Player player2);

    public Game(int roundNumber) {
        this.roundCount = 0;
        this.roundNumber = roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }

    public int getGameType() {
        return gameType;
    }

    public void setGameType(int gameType) {
        this.gameType = gameType;
    }
}
