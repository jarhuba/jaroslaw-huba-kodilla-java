package com.kodilla.rps;

import java.util.Random;

public class SimpleGame extends Game {

    private Random rand = new Random();

    public SimpleGame(int roundNumber) {
        super(roundNumber);
        super.setGameVersion(1);
    }

    @Override
    public int chooseMove(boolean computer) {
        int selectedMove = 0;
        if (computer) {
            selectedMove = rand.nextInt(3) + 1;
            return selectedMove;
        } else {
            selectedMove = Commander.getPlayerMoveSimple();
            return selectedMove;
        }
    }

    @Override
    String gameName() {
        return "PAPIER, KAMIEŃ i NOŻYCE";
    }

    @Override
    public Player whoWinsRound(Player player1, int player1Move, Player player2, int player2Move) {

        int paper = 1;
        int rock = 2;
        int scissors = 3;

        if (player1Move == paper && player2Move == rock) {
            return player1;
        }
        if (player1Move == paper && player2Move == scissors) {
            return player2;
        }

        if (player1Move == rock && player2Move == paper) {
            return player2;
        }
        if (player1Move == rock && player2Move == scissors) {
            return player1;
        }

        if (player1Move == scissors && player2Move == paper) {
            return player1;
        }
        if (player1Move == scissors && player2Move == rock) {
            return player2;
        }
        return player1;
    }
}
