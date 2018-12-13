package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Commander {

    static Scanner sc = new Scanner(System.in);

    public static String readStringFromConsole() {
        return sc.nextLine();
    }

    public static int readIntFromConsole() {
        boolean correct = false;
        int i = 0;
        while (!correct) {
            try {
                i = sc.nextInt();
                sc.nextLine();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Nie podałeś liczby. Spróbuj jeszcze raz.");
                sc.nextLine();
            }
        }
        return i;
    }

    public static void startGameInfo() {
        System.out.println("Witam w grze.");
    }

    public static int selectOpponent() {
        int i = 0;
        boolean finishedReading = false;
        do {
            System.out.println("Wybierz tryb rozgrywki:\n1 - z komputerem\n2 - z całowiekiem\n3 - demo komputer z komputerem");
            i = readIntFromConsole();
            if (isSelectedOpponentAvailable(i)) {
                finishedReading = true;
            }
        }
        while (!finishedReading);
        return i;
    }

    private static boolean isSelectedOpponentAvailable(int number) {
        switch (number) {
            case 1:
            case 2:
            case 3:
                return true;
        }
        System.out.println("Wybierz 1, 2 lub 0.");
        return false;
    }

    public static void endGameInfo() {
        System.out.println("Dziękuję za grę.");
    }

    public static void drawRoundInfo() {
        System.out.println("Remis w tej rundzie, wykonany ten sam gest.");
    }

    public static void drawGameInfo() {
        System.out.println("Remis w grze. Gracie dodatkową runę.");
    }

    public static void showRoundResult(Player playerWhoWins) {
        System.out.println("Tę rundę wygrał " + playerWhoWins.getName() + ".");
    }

    public static void showGameResult(Player player1, Player player2) {
        System.out.println("Punktacja: " + player1.getName() + "->" + player1.getPoints() + "|" + player2.getPoints() + "<-" + player2.getName());
    }

    public static int selectGameType() {
        int gameSelected = 0;
        boolean availableGame = false;
        do {
            System.out.println("Wybierz typ gry \n 1 - tradycyjny\n 2 - rozszeżony\n 0 - kończy program");
            gameSelected = readIntFromConsole();
            switch (gameSelected) {
                case 0:
                    System.out.println("Wybrałeś zakończenie programu");
                    availableGame = true;
                    break;
                case 1:
                    System.out.println("Wybrałeś wariant tradycyjny.");
                    break;
                case 2:
                    System.out.println("Wybrałeś wariant rozszeżony.");
                    break;
                    /*
                default:
                    System.out.println("Wybierz 1, 2 lub 0.");
                    break;
                    */
            }
            availableGame = isSelectedGameTypeAvailable(gameSelected);
        } while (!availableGame);
        return gameSelected;
    }

    private static boolean isSelectedGameTypeAvailable(int number) {
        switch (number) {
            case 0:
            case 1:
            case 2:
                return true;
        }
        System.out.println("Wybierz 1, 2 lub 0.");
        return false;
    }

    public static String getPlayerName() {
        System.out.println("Podaj imię dla gracza:");
        String name;
        boolean correctName = false;
        do {
            name = readStringFromConsole();
            correctName = isNameCorrect(name);
        } while (!correctName);
        return name;
    }

    private static boolean isNameCorrect(String name) {
        if (name != null && !name.isEmpty()) {
            return true;
        } else {
            System.out.println("Niepoprawne imię, podaj imię jeszcze raz.");
            return false;
        }
    }

    public static int getRoundsToPlay() {
        System.out.println("Podaj ilość rund (max 1000):");
        boolean correctRoundNumber = false;
        int rounds = 0;
        do {
            rounds = readIntFromConsole();
            correctRoundNumber = isRoundsToPlayCorrect(rounds);
        } while (!correctRoundNumber);

        return rounds;
    }

    private static boolean isRoundsToPlayCorrect(int rounds) {
        if (rounds > 0 && rounds < 1001) {
            return true;
        } else {
            System.out.println("Podałeś niedozwoloną wartość, spróbuj jeszcze raz");
            return false;
        }
    }

    public static void startGameInvocation(Game game, Player player1, Player player2) {
        System.out.println("Witaj " + player1.getName() + " i " + player2.getName() + ".");
        System.out.println("Grasz w " + game.gameName());
        System.out.println("Wasz pojedynek ma " + game.getRoundNumber() + " rund.");
    }

    public static int getPlayerMoveSimple(String playerName) {
        System.out.println(playerName + " wybierz gest:");
        boolean correctMove = false;
        int move = 0;
        do {
            move = readIntFromConsole();
            correctMove = isPlayerMoveSimpleCorrect(move);
        } while (!correctMove);
        return move;
    }

    private static boolean isPlayerMoveSimpleCorrect(int move) {
        if (move > 0 && move < 4) {
            return true;
        } else {
            System.out.println("Podałeś niedozwolony ruch, wybierz 1, 2 lub 3");
            return false;
        }
    }

    public static int getPlayerMoveExtended(String playerName) {
        System.out.println(playerName + " wybierz gest:");
        boolean correctMove = false;
        int move = 0;
        do {
            move = readIntFromConsole();
            correctMove = isPlayerMoveExtendedCorrect(move);
        } while (!correctMove);
        return move;
    }

    private static boolean isPlayerMoveExtendedCorrect(int move) {
        if (move > 0 && move < 6) {
            return true;
        } else {
            System.out.println("Podałeś niedozwolony ruch, wybierz 1, 2, 3, 4 lub 5");
            return false;
        }
    }

    public static void showSelectedMove(Player player, int i) {
        System.out.println(player.getName() + " wybrał " + i + ".");
    }

    public static void showMenu(Game game) {
        String simple = "Podaj swój ruch:\n1 - papier\n2 - kamień\n3 - nożyce";
        String extended = "\n4 - spock\n5 - jaszczurka";
        if (game.getGameVersion() == 1) {
            System.out.println(simple);
        } else {
            System.out.println(simple + extended);
        }
    }

    public static void showVerdict(GameProcessor gameProcessor) {
        System.out.println("Zwycięzcą gry jest " + gameProcessor.verdict().getName() + ".");
    }

    public static void closeInput() {
        sc.close();
    }
}
