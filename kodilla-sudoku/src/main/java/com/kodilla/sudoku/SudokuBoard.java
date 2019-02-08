package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SudokuBoard {

    private List<SudokuRow> sudokuBoardList = new ArrayList<>();

    public SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            sudokuBoardList.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getSudokuBoardList() {
        return sudokuBoardList;
    }

    @Override
    public String toString() {
        String boardString = sudokuBoardList.stream()
                .map(n -> n.toString())
                .collect(Collectors.joining("\n", "___________________\n",
                        "\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯"));
        return boardString;
    }
}
