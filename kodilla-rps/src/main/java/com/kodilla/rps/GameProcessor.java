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

        boolean roundsFinished = false;
        do {
            if (game.getRoundNumber() > game.getRoundCount()) {
                Commander.showMenu(game);
                int player1Move = player1.getMove();
                int player2Move = player2.getMove();
                Commander.showSelectedMove(player1.getName(), Gestures.getGestureStringName(player1Move));
                Commander.showSelectedMove(player2.getName(), Gestures.getGestureStringName(player2Move));
                RoundResoult winnerPlayer = game.whoWinRound(player1Move, player2Move);

                switch (winnerPlayer) {
                    case PLAYER1:
                        Commander.showRoundResult(player1.getName());
                        player1.addPoint();
                        break;
                    case PLAYER2:
                        Commander.showRoundResult(player2.getName());
                        player2.addPoint();
                        break;
                    case REMIS:
                        Commander.drawRoundInfo();
                        break;
                }
                game.setRoundCount(game.getRoundCount() + 1);
            }

            else if (game.getRoundNumber() == game.getRoundCount() && player1.getPoints() == player2.getPoints()) {
                Commander.drawGameInfo();
                game.setRoundNumber(game.getRoundNumber() + 1);
            } else {
                roundsFinished = true;
            }
        } while (!roundsFinished);
    }

    /*
        public Player playerFromRoundResoult(RoundResoult roundResoult) {
            switch (roundResoult) {
                case PLAYER1:
                    return this.player1;
                case PLAYER2:
                    return this.player2;
            }
            return this.player1;
        }
    */
    public Player verdict() {
        Commander.showGameResult(player1, player2);
        if (player1.getPoints() > player2.getPoints()) {
            return player1;
        } else {
            return player2;
        }
    }
}
