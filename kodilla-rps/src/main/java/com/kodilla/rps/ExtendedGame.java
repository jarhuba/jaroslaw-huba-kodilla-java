package com.kodilla.rps;

public class ExtendedGame extends Game {

    public ExtendedGame(int roundNumber) {
        super(roundNumber);
        super.setGameType(2);
    }

    @Override
    String gameName() {
        return "PAPIER, KAMIEŃ, NOŻYCE, SPOCK, JASZCZURKA";
    }

    @Override
    public Player whoWinsRound(Player player1, Player player2) {
        int player1int = player1.getMove();
        int player2int = player2.getMove();
        int paper = 1;
        int rock = 2;
        int scissors = 3;
        int spock = 4;
        int lizard = 5;

        if (player1int == paper && player2int == rock) {
            return player1;
        }
        if (player1int == paper && player2int == scissors) {
            return player2;
        }
        if (player1int == paper && player2int == spock) {
            return player1;
        }
        if (player1int == paper && player2int == lizard) {
            return player2;
        }

        if (player1int == rock && player2int == paper) {
            return player2;
        }
        if (player1int == rock && player2int == scissors) {
            return player1;
        }
        if (player1int == rock && player2int == spock) {
            return player2;
        }
        if (player1int == rock && player2int == lizard) {
            return player1;
        }

        if (player1int == scissors && player2int == paper) {
            return player1;
        }
        if (player1int == scissors && player2int == rock) {
            return player2;
        }
        if (player1int == scissors && player2int == spock) {
            return player2;
        }
        if (player1int == scissors && player2int == lizard) {
            return player2;
        }

        if (player1int == spock && player2int == rock) {
            return player1;
        }
        if (player1int == spock && player2int == scissors) {
            return player1;
        }
        if (player1int == spock && player2int == paper) {
            return player2;
        }
        if (player1int == spock && player2int == lizard) {
            return player2;
        }

        if (player1int == lizard && player2int == rock) {
            return player2;
        }
        if (player1int == lizard && player2int == scissors) {
            return player2;
        }
        if (player1int == lizard && player2int == spock) {
            return player1;
        }
        if (player1int == lizard && player2int == paper) {
            return player1;
        }

        return player1;
    }
}
