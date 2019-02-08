package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[] args) {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
            SudokuBoard sb = new SudokuBoard();
            System.out.println(sb);

        }
    }

    public boolean resolveSudoku() {
        System.out.println("Czy chcesz rozwiązać SUDOKU?");
        return true;
    }
}
