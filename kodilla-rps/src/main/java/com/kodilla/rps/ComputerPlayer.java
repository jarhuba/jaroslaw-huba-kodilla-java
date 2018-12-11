package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer extends Player {

    private Random rand = new Random();

    public ComputerPlayer() {
        super("Komputer");
    }

    @Override
    void chooseMove(Game game) {
        if (game.getGameType() == 1) {
            setMove(rand.nextInt(3) + 1);
        }
        if (game.getGameType() == 2) {
            setMove(rand.nextInt(5) + 1);
        }
    }
}
