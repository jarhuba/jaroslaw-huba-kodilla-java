package com.kodilla.rps;

public class GameController {

    public void startGame() {
        Commander.startGameInfo();
        String playerName = Commander.getPlayerName();
        Player computer = new ComputerPlayer();
        Player human = new HumanPlayer(playerName);
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
                    human.setPoints(0);
                    computer.setPoints(0);
                    gameProcessor = new GameProcessor(game, human, computer);
                    gameProcessor.start();
                    Commander.showVerdict(gameProcessor);
                    continue;
                case 2:
                    roundToPlay = Commander.getRoundsToPlay();
                    game = new ExtendedGame(roundToPlay);
                    human.setPoints(0);
                    computer.setPoints(0);
                    gameProcessor = new GameProcessor(game, human, computer);
                    gameProcessor.start();
                    Commander.showVerdict(gameProcessor);
                    continue;
            }
        }
    }

    public void endGame() {
        Commander.endGameInfo();
        Commander.closeInput();
    }
}
