package com.kodilla.rps;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    int getMove() {
        return Commander.getPlayerMoveSimple(getName());
    }
}
