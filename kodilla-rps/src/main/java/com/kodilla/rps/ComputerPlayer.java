package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer() {
        super("Komputer");
        super.setComputer(true);
    }

    @Override
    int getMove(Game game) {
        return game.chooseMove(this.isComputer());
    }
}