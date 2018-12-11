package com.kodilla.rps;

public class SimpleGame extends Game {

    public SimpleGame(int roundNumber) {
        super(roundNumber);
        super.setGameType(1);
    }

    @Override
    String gameName() {
        return "PAPIER, KAMIEŃ i NOŻYCE";
    }

    @Override
    public Player whoWinsRound(Player player1, Player player2) {
        int player1Int = player1.getMove();
        int player2Int = player2.getMove();
        int paper = 1;
        int rock = 2;
        int scissors = 3;

        if (player1Int == paper && player2Int == rock) {
            return player1;
        }
        if (player1Int == paper && player2Int == scissors) {
            return player2;
        }

        if (player1Int == rock && player2Int == paper) {
            return player2;
        }
        if (player1Int == rock && player2Int == scissors) {
            return player1;
        }

        if (player1Int == scissors && player2Int == paper) {
            return player1;
        }
        if (player1Int == scissors && player2Int == rock) {
            return player2;
        }
        return player1;
    }
}
