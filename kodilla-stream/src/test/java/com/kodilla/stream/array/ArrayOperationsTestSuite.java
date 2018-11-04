package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        //When
        double averageExpected = 5.5;
        double averageCalculated = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(averageExpected, averageCalculated, 0);
    }
}
