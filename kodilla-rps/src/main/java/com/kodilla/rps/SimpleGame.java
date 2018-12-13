package com.kodilla.rps;

import java.util.Random;

public class SimpleGame extends Game {

    private Random rand = new Random();

    public SimpleGame(int roundNumber) {
        super(roundNumber);
        super.setGameVersion("PAPIER, KAMIEŃ i NOŻYCE");
    }

    @Override
    public int chooseMove(Player player) {
        boolean computer = player.isComputer();
        int selectedMove = 0;
        if (computer) {
            selectedMove = rand.nextInt(3) + 1;
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                // pomiń błąd i kontynuuj
            }
            return selectedMove;
        } else {
            selectedMove = Commander.getPlayerMoveSimple(player.getName());
            return selectedMove;
        }
    }

    @Override
    public Player whoWinsRound(Player player1, int player1Move, Player player2, int player2Move) {
        /*
        paper = 1;
        rock = 2;
        scissors = 3;
        */

        int simpleGameRules[][] = {{1, 2, 1}, {1, 3, 2}, {2, 3, 1}, {2, 1, 2}, {3, 1, 1}, {3, 2, 2}};

        int playerNumberWhoWins = 0;

        for (int i = 0; i < simpleGameRules.length - 1; i++) {
            if (simpleGameRules[i][0] == player1Move && simpleGameRules[i][1] == player2Move) {
                playerNumberWhoWins = simpleGameRules[i][2];
            }
        }

        if (playerNumberWhoWins == 1) {
            return player1;
        } else {
            return player2;
        }
    }
}
