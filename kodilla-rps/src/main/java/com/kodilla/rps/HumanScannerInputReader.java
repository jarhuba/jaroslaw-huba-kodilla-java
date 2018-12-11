package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanScannerInputReader {

    private static HumanScannerInputReader humanScannerInputReaderInstance;
    private Scanner scanner;

    public void closeScanner() {
        scanner.close();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public int getInt() {
        boolean correctInt = false;
        int number = 0;
        do {
            try {
                number = getScanner().nextInt();
                scanner.nextLine();
                correctInt = true;
            } catch (InputMismatchException e) {
                Commander.noIntInfo();
                scanner.nextLine();
            }
        } while (!correctInt);

        return number;
    }

    public String getWord() {
        boolean correctString = false;
        String word = "";
        do {
            word = getScanner().nextLine();
            correctString = true;
        } while (!correctString);

        return word;
    }

    public static HumanScannerInputReader getInstance() {
        if (humanScannerInputReaderInstance == null) {
            humanScannerInputReaderInstance = new HumanScannerInputReader();
        }
        return humanScannerInputReaderInstance;
    }

    private HumanScannerInputReader() {
        scanner = new Scanner(System.in);
    }
}

