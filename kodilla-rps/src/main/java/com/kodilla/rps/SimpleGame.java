package com.kodilla.rps;

public class SimpleGame extends Game {

    public SimpleGame(int roundNumber) {
        super(roundNumber);
        super.setGameVersion("PAPIER, KAMIEŃ i NOŻYCE");
    }

    @Override
    public RoundResoult whoWinRound(int player1Move, int player2Move) {
        /*
        paper = 0;
        rock = 1;
        scissors = 2;
        */

        int tab[][] = {
                {0, 1, 2},
                {2, 0, 1},
                {1, 2, 0}
        };

        int roundResoult = tab[player1Move - 1][player2Move - 1];

        return RoundResoult.getRoundResoult(roundResoult);
    }
}
