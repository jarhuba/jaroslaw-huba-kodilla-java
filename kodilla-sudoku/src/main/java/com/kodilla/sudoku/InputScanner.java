package com.kodilla.sudoku;

import java.util.Scanner;

public class InputScanner {

    private static InputScanner inputScannerInstance;
    private Scanner scanner;

    private InputScanner() {
    }

    public InputScanner getInstance() {
        if (scanner == null) {
            synchronized (InputScanner.class) {
                if (scanner == null) {
                    scanner = new Scanner(System.in);
                }
            }
        }
        return inputScannerInstance;
    }
}
