package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SudokuBoard extends Prototype {

    private List<SudokuRow> sudokuBoardList = new ArrayList<>();

    public SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            sudokuBoardList.add(new SudokuRow());
        }
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = (SudokuBoard) super.clone();
        clonedBoard.sudokuBoardList = new ArrayList<>();
        for (SudokuRow theRow : sudokuBoardList) {
           // SudokuRow clonedRow = new SudokuRow(theRow.getSudokuRowList());
        }
        return (SudokuBoard) super.clone();
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
