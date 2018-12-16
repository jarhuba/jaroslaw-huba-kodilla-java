package com.kodilla.rps;

public enum RoundResoult {
    REMIS(0), PLAYER1(1), PLAYER2(2);

    private final int number;

    RoundResoult(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    static RoundResoult getRoundResoult(int number) {
        switch (number) {
            case 0:
                return RoundResoult.REMIS;
            case 1:
                return RoundResoult.PLAYER1;
            case 2:
                return RoundResoult.PLAYER2;
        }
        return RoundResoult.REMIS;
    }
}
