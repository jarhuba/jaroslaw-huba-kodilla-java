package com.kodilla.rps;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    void chooseMove(Game game) {
        setMove(Commander.getPlayerMove(game));
    }
}
