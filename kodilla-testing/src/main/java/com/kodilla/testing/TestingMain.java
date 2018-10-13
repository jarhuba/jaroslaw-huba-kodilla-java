package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(10,4);

        int sum = calculator.getA() + calculator.getB();
        int difference = calculator.getA() - calculator.getB();

        if (calculator.add() == sum) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }

        if (calculator.subtract() == difference) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }
}
