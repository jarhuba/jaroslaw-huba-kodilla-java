package com.kodilla.rps;

public abstract class Game {

    private int roundCount;
    private int roundNumber;
    private String gameVersion;

    abstract RoundResoult whoWinRound(int player1Move, int player2Move);

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

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }
}
