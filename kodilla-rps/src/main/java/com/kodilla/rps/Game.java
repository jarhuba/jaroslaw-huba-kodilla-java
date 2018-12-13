package com.kodilla.rps;

public abstract class Game {

    private int roundCount;
    private int roundNumber;
    private String gameVersion;

    abstract Player whoWinsRound(Player player1, int player1Move, Player player2, int player2Move);

    public Game(int roundNumber) {
        this.roundCount = 0;
        this.roundNumber = roundNumber;
    }

    abstract int chooseMove(Player player);

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

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }
}
