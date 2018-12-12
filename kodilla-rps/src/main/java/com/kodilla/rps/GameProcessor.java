package com.kodilla.rps;

public class GameProcessor {

    private Game game;
    private Player player1;
    private Player player2;

    public GameProcessor(Game game, Player human, Player computer) {
        this.game = game;
        this.player1 = human;
        this.player2 = computer;
    }

    public void start() {
        Commander.startGameInvocation(game, player1, player2);
        Player tmp;

        int player1Move;
        int player2Move;

        boolean roundsFinished = false;
        while (!roundsFinished) {
            if (game.getRoundNumber() > game.getRoundCount()) {
                Commander.showMenu(game);
                player1Move = game.chooseMove(player1);
                player2Move = game.chooseMove(player2);

                Commander.showSelectedMove(player1, player1Move);
                Commander.showSelectedMove(player2, player2Move);

                if (player1Move == player2Move) {
                    Commander.drawRoundInfo();
                } else {
                    tmp = game.whoWinsRound(player1, player1Move, player2, player2Move);
                    Commander.showRoundResult(tmp);
                    tmp.addPoint();
                }
                game.setRoundCount(game.getRoundCount() + 1);
            } else {
                if (player1.getPoints() == player2.getPoints()) {
                    Commander.drawGameInfo();
                    game.setRoundNumber(game.getRoundNumber() + 1);
                } else {
                    roundsFinished = true;
                }
            }
        }
    }

    public Player verdict() {
        Commander.showGameResult(player1, player2);
        if (player1.getPoints() > player2.getPoints()) {
            return player1;
        } else {
            return player2;
        }
    }
}
