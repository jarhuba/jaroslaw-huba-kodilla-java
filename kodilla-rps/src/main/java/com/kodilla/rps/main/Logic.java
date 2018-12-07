package com.kodilla.rps.main;

public class Logic {

    private String rock = "rock";
    private String paper = "paper";
    private String scissors = "scissors";
    private Player player1RPC;
    private Player player2RPC;

    public Logic(Player player1RPC, Player player2RPC) {
        this.player1RPC = player1RPC;
        this.player2RPC = player2RPC;
    }

    public Player matchWinner() {
        Player winner = new Player();
        if (player1RPC.getRps() == player2RPC.getRps()) {
        }
        if (player1RPC.getRps() == rock && player2RPC.getRps() == paper) {
            player2RPC.setWinner(true);
            winner = player2RPC;
        }
        if (player1RPC.getRps() == rock && player2RPC.getRps() == scissors) {
            player1RPC.setWinner(true);
            winner = player1RPC;
        }
        if (player1RPC.getRps() == paper && player2RPC.getRps() == rock) {
            player1RPC.setWinner(true);
            winner = player1RPC;
        }
        if (player1RPC.getRps() == paper && player2RPC.getRps() == scissors) {
            player2RPC.setWinner(true);
            winner = player2RPC;
        }
        if (player1RPC.getRps() == scissors && player2RPC.getRps() == rock) {
            player2RPC.setWinner(true);
            winner = player2RPC;
        }
        if (player1RPC.getRps() == scissors && player2RPC.getRps() == paper) {
            player1RPC.setWinner(true);
            winner = player1RPC;
        }
        return winner;
    }
}
