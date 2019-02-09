package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuElement {

    public static final int EMPTY = -1;
    private int value = EMPTY;
    private List<Integer> possibleValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        possibleValues = new ArrayList<>();
        this.value = value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void removePossibleValue(int value) {
        possibleValues.remove(new Integer(value));
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
