package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer extends Player {

    private static final Random random = new Random();

    public ComputerPlayer() {
        super("Komputer");
    }

    @Override
    int getMove() {
        return random.nextInt(3) + 1;
    }
}
