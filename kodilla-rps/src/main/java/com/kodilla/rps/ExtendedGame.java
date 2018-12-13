package com.kodilla.rps;

import java.util.Random;

public class ExtendedGame extends Game {

    private Random rand = new Random();

    public ExtendedGame(int roundNumber) {
        super(roundNumber);
        super.setGameVersion(2);
    }

    @Override
    public int chooseMove(Player player) {
        boolean computer = player.isComputer();
        int selectedMove;
        if (computer) {
            selectedMove = rand.nextInt(5) + 1;
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                // pomiń błąd i kontynuuj
            }
            return selectedMove;
        } else {
            selectedMove = Commander.getPlayerMoveExtended(player.getName());
            return selectedMove;
        }
    }

    @Override
    String gameName() {
        return "PAPIER, KAMIEŃ, NOŻYCE, SPOCK, JASZCZURKA";
    }

    @Override
    public Player whoWinsRound(Player player1, int player1Move, Player player2, int player2Move) {

        int paper = 1;
        int rock = 2;
        int scissors = 3;
        int spock = 4;
        int lizard = 5;

        if (player1Move == paper && player2Move == rock) {
            return player1;
        }
        if (player1Move == paper && player2Move == scissors) {
            return player2;
        }
        if (player1Move == paper && player2Move == spock) {
            return player1;
        }
        if (player1Move == paper && player2Move == lizard) {
            return player2;
        }

        if (player1Move == rock && player2Move == paper) {
            return player2;
        }
        if (player1Move == rock && player2Move == scissors) {
            return player1;
        }
        if (player1Move == rock && player2Move == spock) {
            return player2;
        }
        if (player1Move == rock && player2Move == lizard) {
            return player1;
        }

        if (player1Move == scissors && player2Move == paper) {
            return player1;
        }
        if (player1Move == scissors && player2Move == rock) {
            return player2;
        }
        if (player1Move == scissors && player2Move == spock) {
            return player2;
        }
        if (player1Move == scissors && player2Move == lizard) {
            return player2;
        }

        if (player1Move == spock && player2Move == rock) {
            return player1;
        }
        if (player1Move == spock && player2Move == scissors) {
            return player1;
        }
        if (player1Move == spock && player2Move == paper) {
            return player2;
        }
        if (player1Move == spock && player2Move == lizard) {
            return player2;
        }

        if (player1Move == lizard && player2Move == rock) {
            return player2;
        }
        if (player1Move == lizard && player2Move == scissors) {
            return player2;
        }
        if (player1Move == lizard && player2Move == spock) {
            return player1;
        }
        if (player1Move == lizard && player2Move == paper) {
            return player1;
        }

        return player1;
    }
}
