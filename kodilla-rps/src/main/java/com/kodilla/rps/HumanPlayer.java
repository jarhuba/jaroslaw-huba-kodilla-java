package com.kodilla.rps;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
        super.setComputer(false);
    }

    @Override
    int getMove(Game game) {
        return game.chooseMove(this.isComputer());
    }
}
