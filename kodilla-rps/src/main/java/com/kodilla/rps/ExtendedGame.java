package com.kodilla.rps;

import java.util.Random;

public class ExtendedGame extends Game {

    private Random rand = new Random();

    public ExtendedGame(int roundNumber) {
        super(roundNumber);
        super.setGameVersion("PAPIER, KAMIEŃ, NOŻYCE, SPOCK, JASZCZURKA");
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
    public Player whoWinsRound(Player player1, int player1Move, Player player2, int player2Move) {
        /*
        paper = 1
        rock = 2
        scissors = 3
        spock = 4
        lizard = 5

        kamień zgniata jaszczurkę,
        jaszczurka zatruwa Spocka,
        Spock łamie nożyce,
        nożyce ranią jaszczurkę,
        jaszczurka zjada papier,
        papier udowadnia błąd Spocka,
        Spock kruszy kamień.
        */

        int simpleGameRules[][] = {{1, 2, 1}, {1, 3, 2}, {2, 3, 1}, {2, 1, 2}, {3, 1, 1}, {3, 2, 2}};
        int extensionGameRules[][] = {{1, 4, 1}, {1, 5, 2}, {2, 4, 2}, {2, 5, 1}, {3, 4, 2}, {3, 5, 1},
                {4, 1, 2}, {4, 2, 1}, {4, 3, 1}, {4, 5, 2}, {5, 1, 1}, {5, 2, 2}, {5, 3, 2}, {5, 4, 1}};

        int playerNumberWhoWins = 0;

        for (int i = 0; i < simpleGameRules.length - 1; i++) {
            if (simpleGameRules[i][0] == player1Move && simpleGameRules[i][1] == player2Move) {
                playerNumberWhoWins = simpleGameRules[i][2];
            }
        }
        for (int i = 0; i < extensionGameRules.length - 1; i++) {
            if (extensionGameRules[i][0] == player1Move && extensionGameRules[i][1] == player2Move) {
                playerNumberWhoWins = extensionGameRules[i][2];
            }
        }

        if (playerNumberWhoWins == 1) {
            return player1;
        } else {
            return player2;
        }
    }
}
