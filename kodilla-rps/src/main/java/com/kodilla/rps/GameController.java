package com.kodilla.rps;

public class GameController {

    public void startGame() {
        Commander.startGameInfo();
        GameProcessor gameProcessor;
        Game game;
        Player player1;
        Player player2;

        int playersType = Commander.selectOpponent();
        switch (playersType) {
            case 1:
                player1 = new HumanPlayer(Commander.getPlayerName());
                player2 = new ComputerPlayer();
                break;
            case 2:
                player1 = new HumanPlayer(Commander.getPlayerName());
                player2 = new HumanPlayer(Commander.getPlayerName());
                break;
            case 3:
                player1 = new ComputerPlayer();
                player2 = new ComputerPlayer();
                break;
            default:
                // default dodane dla zapewnienia utwożenia obiektów Player,
                // może lepiej podać Player player1 = null; ?
                player1 = new ComputerPlayer();
                player2 = new ComputerPlayer();
                break;
        }

        int roundToPlay;
        int gameType;
        boolean selectedGame = false;
        while (!selectedGame) {
            gameType = Commander.selectGameType();
            switch (gameType) {
                case 0:
                    selectedGame = true;
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
