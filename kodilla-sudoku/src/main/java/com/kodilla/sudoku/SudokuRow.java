package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SudokuRow {

    private List<SudokuElement> sudokuRowList = new ArrayList<>();

    public SudokuRow() {
        for (int i = 0; i < 9; i++) {
            sudokuRowList.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getSudokuRowList() {
        return sudokuRowList;
    }

    @Override
    public String toString() {
        String rawRowString = sudokuRowList.stream()
                .map(SudokuElement::toString)
                .collect(Collectors.joining("-", "|", "|"));
        return rawRowString;
    }
}
