package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test case: begin");
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        //When
        ArrayList<Integer> numbers = new ArrayList<>(); //empty list
        ArrayList<Integer> listAfterOddExtermination = oddNumberExterminator.exterminate(numbers);
        ArrayList<Integer> numbersWithoutOdd = new ArrayList<>(Arrays.asList(0)); // zero is expected
        System.out.println("Testing Case: " + listAfterOddExtermination);
        //Then
        Assert.assertEquals(numbersWithoutOdd, listAfterOddExtermination);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        //When
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0,1,2,3,3,3,4,5,6,7,8,9,10,11,12));
        ArrayList<Integer> listAfterOddExtermination = oddNumberExterminator.exterminate(numbers);
        ArrayList<Integer> expectedNumbersWithoutOdd = new ArrayList<>(Arrays.asList(0,2,4,6,8,10,12));
        System.out.println("Testing Case: " + listAfterOddExtermination);
        //Then
        Assert.assertEquals(expectedNumbersWithoutOdd, listAfterOddExtermination);
    }
}
