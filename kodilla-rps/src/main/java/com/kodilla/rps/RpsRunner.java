package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {

        System.out.println("Gra w papier, kamień, nożyce");
        System.out.println("ver. 0.01 " + "initial attempt");

        boolean end = false;

        Player computer = new Player(false, "Deep Thought Computer");
        Player human = new Player(true, "Dwukwiat");
        human.setRps("paper");

        Logic logic = new Logic(computer, human);
        Player winner = logic.matchWinner();
        System.out.println("And the winner is... " + winner.getName());

        //brak wprowadzania danych, opcji wyboru przez wchile(!end) itd

    }
}
