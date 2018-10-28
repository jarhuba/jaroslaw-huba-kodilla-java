package com.kodilla.testing.collection;

import java.util.ArrayList;


public class OddNumberExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> listToEdit = numbers;
        if (listToEdit.size() == 0) {
            System.out.println("Pusta tablica");
            listToEdit.add(0); // return only zero if list is empty as a desired result
            return listToEdit;
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (listToEdit.get(i) % 2 != 0) {
                listToEdit.remove(i);
                i = -1;
            }
        }
        return listToEdit;
    }
}
