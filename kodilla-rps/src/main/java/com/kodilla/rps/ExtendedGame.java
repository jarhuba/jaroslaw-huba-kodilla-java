package com.kodilla.rps;

public class ExtendedGame extends Game {

    public ExtendedGame(int roundNumber) {
        super(roundNumber);
        super.setGameVersion("PAPIER, KAMIEŃ, NOŻYCE, SPOCK, JASZCZURKA");
    }

    @Override
    public RoundResoult whoWinRound(int player1Move, int player2Move) {
        /*
        paper = 0
        rock = 1
        scissors = 2
        spock = 3
        lizard = 4

        1 kamień zgniata        4 jaszczurkę,
        4 jaszczurka zatruwa    3 Spocka,
        3 Spock łamie           2 nożyce,
        2 nożyce ranią          4 jaszczurkę,
        4 jaszczurka zjada      0 papier,
        0 papier udowadnia błąd 3 Spocka,
        3 Spock kruszy          1 kamień.
        */

        int[][] tab = {
                {0, 1, 2, 1, 2},
                {2, 0, 1, 2, 1},
                {1, 2, 0, 2, 1},
                {2, 1, 1, 0, 2},
                {1, 2, 2, 1, 0}
        };
        
        int roundResoult = tab[player1Move - 1][player2Move - 1];

        return RoundResoult.getRoundResoult(roundResoult);
    }
}
