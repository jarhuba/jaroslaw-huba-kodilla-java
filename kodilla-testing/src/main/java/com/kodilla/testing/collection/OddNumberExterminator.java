package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumberExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            System.out.println("pusty");
            return numbers;
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            }
        }
        return numbers;
    }
}
