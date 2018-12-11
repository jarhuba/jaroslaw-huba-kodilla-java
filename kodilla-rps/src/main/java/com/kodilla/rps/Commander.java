package com.kodilla.rps;

public class Commander {

    public static void startGameInfo() {
        System.out.println("Witam w grze.");
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

    public static void noIntInfo() {
        System.out.println("Nie wprowadziłeś liczby, spróbuj jeszcze raz.");
    }

    public static int selectGameType() {
        int gameSelected = 0;
        boolean availableGame = false;
        do {
            System.out.println("Wybierz typ gry \n 1 - tradycyjny\n 2 - rozszeżony\n 0 - kończy program");
            gameSelected = HumanScannerInputReader.getInstance().getInt();
            if (gameSelected == 1) {
                System.out.println("Wybrałeś wariant tradycyjny.");
            }
            if (gameSelected == 2) {
                System.out.println("Wybrałeś wariant rozszeżony.");
            }
            availableGame = isSelectedGameTypeAvailable(gameSelected);
        } while (!availableGame);
        return gameSelected;
    }

    private static boolean isSelectedGameTypeAvailable(int number) {
        if (number == 0) {
            return true;
        }
        if (number == 1) {
            return true;
        }
        if (number == 2) {
            return true;
        } else {
            System.out.println("Wybierz 1, 2 lub 0.");
            return false;
        }
    }

    public static String getPlayerName() {
        System.out.println("Podaj swoje imię:");
        String name;
        boolean correctName = false;
        do {
            name = HumanScannerInputReader.getInstance().getWord();
            correctName = isNameCorrect(name);
        } while (!correctName);
        return name;
    }

    private static boolean isNameCorrect(String name) {
        if (name != null && !name.isEmpty()) {
            return true;
        } else {
            System.out.println("Niepoprawne imię, podaj imię jeszcze raz");
            return false;
        }
    }

    public static int getRoundsToPlay() {
        System.out.println("Podaj ilość rund (max 10):");
        boolean correctRoundNumber = false;
        int rounds = 0;
        do {
            rounds = HumanScannerInputReader.getInstance().getInt();
            correctRoundNumber = isRoundsToPlayCorrect(rounds);
        } while (!correctRoundNumber);

        return rounds;
    }

    private static boolean isRoundsToPlayCorrect(int rounds) {
        if (rounds > 0 && rounds < 11) {
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

    public static int getPlayerMove(Game game) {
        System.out.println("Wybierz gest:");

        boolean correctMove = false;
        int move = 0;
        do {
            move = HumanScannerInputReader.getInstance().getInt();
            if (game.getGameType() == 1) {
                correctMove = isPlayerSimpleMoveCorrect(move);
            }
            if (game.getGameType() == 2) {
                correctMove = isPlayerExtendedMoveCorrect(move);
            }

        } while (!correctMove);

        return move;
    }

    private static boolean isPlayerSimpleMoveCorrect(int move) {
        if (move > 0 && move < 4) {
            return true;
        } else {
            System.out.println("Podałeś niedozwolony ruch, wybierz 1, 2 lub 3");
            return false;
        }
    }

    public static void showSelectedMoves(Player player1, Player player2) {
        System.out.print(player1.getName() + " wybrał " + player1.getMove() + ", ");
        System.out.println(player2.getName() + " wybrał " + player2.getMove() + ".");
    }

    private static boolean isPlayerExtendedMoveCorrect(int move) {
        if (move > 0 && move < 6) {
            return true;
        } else {
            System.out.println("Podałeś niedozwolony ruch, wybierz 1, 2, 3, 4 lub 5");
            return false;
        }
    }

    public static void showMenu(Game game) {
        System.out.println(new Menu(game).getMenu());
    }

    public static void showVerdict(GameProcessor gameProcessor) {
        System.out.println("Zwycięzcą gry jest " + gameProcessor.verdict().getName() + ".");
    }

    public static void closeInput() {
        HumanScannerInputReader.getInstance().closeScanner();
    }
}
