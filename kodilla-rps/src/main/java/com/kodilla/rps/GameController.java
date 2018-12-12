package com.kodilla.rps;

public class GameController {

    public void startGame() {
        Commander.startGameInfo();
        Player player1 = new HumanPlayer(Commander.getPlayerName());
        Player player2 = new ComputerPlayer();
        GameProcessor gameProcessor;
        Game game;
        int roundToPlay;
        int gameType;
        boolean doingGame = true;

        while (doingGame) {
            gameType = Commander.selectGameType();
            switch (gameType) {
                case 0:
                    doingGame = false;
                    break;
                case 1:
                    roundToPlay = Commander.getRoundsToPlay();
                    game = new SimpleGame(roundToPlay);
                    player1.setPoints(0);
                    player2.setPoints(0);
                    gameProcessor = new GameProcessor(game, player1, player2);
                    gameProcessor.start();
                    Commander.showVerdict(gameProcessor);
                    break;
                case 2:
                    roundToPlay = Commander.getRoundsToPlay();
                    game = new ExtendedGame(roundToPlay);
                    player1.setPoints(0);
                    player2.setPoints(0);
                    gameProcessor = new GameProcessor(game, player1, player2);
                    gameProcessor.start();
                    Commander.showVerdict(gameProcessor);
                    break;
            }
        }
    }

    public void endGame() {
        Commander.endGameInfo();
        Commander.closeInput();
    }
}
