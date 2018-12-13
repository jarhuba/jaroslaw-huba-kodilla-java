package com.kodilla.rps;

public abstract class Game {

    private int roundCount;
    private int roundNumber;
    private int gameVersion;

    abstract String gameName();

    abstract Player whoWinsRound(Player player1, int player1Move, Player player2, int player2Move);

    public Game(int roundNumber) {
        this.roundCount = 0;
        this.roundNumber = roundNumber;
    }

    abstract int chooseMove(boolean computer);

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

    public int getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(int gameVersion) {
        this.gameVersion = gameVersion;
    }
}
