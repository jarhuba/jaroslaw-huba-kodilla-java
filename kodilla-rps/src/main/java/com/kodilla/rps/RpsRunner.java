package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {
        GameController game = new GameController();
        game.startGame();
        game.endGame();
    }
}
