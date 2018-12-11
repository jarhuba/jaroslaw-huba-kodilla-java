package com.kodilla.rps;

public class Menu {

    private String menu;

    public Menu(Game game) {
        StringBuilder simple = new StringBuilder();
        StringBuilder extended = new StringBuilder();
        simple.append(System.lineSeparator())
                .append("Podaj swój ruch:").append(System.lineSeparator())
                .append("1 - papier").append(System.lineSeparator())
                .append("2 - kamień").append(System.lineSeparator())
                .append("3 - nożyce").append(System.lineSeparator());
        extended.append("4 - spock").append(System.lineSeparator())
                .append("5 - jaszczurka").append(System.lineSeparator());

        switch (game.getGameType()) {
            case 1:
                menu = simple.toString();
                break;
            case 2:
                menu = simple.toString() + extended.toString();
                break;
        }
    }

    public String getMenu() {
        return menu;
    }
}
