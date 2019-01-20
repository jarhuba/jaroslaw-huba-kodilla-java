package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    private Calculator calculator;

    @Before
    public void createCalculatorFromContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        calculator = context.getBean(Calculator.class);
    }

    @Test
    public void testCalculations() {
        //Given

        //When
        double resultAdd = calculator.add(3, 5);
        double resultSub = calculator.sub(3, 5);
        double resultMul = calculator.mul(3, 5);
        double resultDiv = calculator.div(3, 5);

        //Then
        Assert.assertEquals(8, resultAdd, 0);
        Assert.assertEquals(-2, resultSub, 0);
        Assert.assertEquals(15, resultMul, 0);
        Assert.assertEquals(0.6, resultDiv, 0.00001);
    }

    @Test
    public void testCalculationsAdd() {
        //Given

        //When
        double resultAddPositiveToZero = calculator.add(5, 0);
        double resultAddZeroToPositive = calculator.add(0, 5);
        double resultAddNegativeToZero = calculator.add(-5, 0);
        double resultAddZeroToNegative = calculator.add(0, -5);

        //Then
        Assert.assertEquals(5, resultAddPositiveToZero, 0);
        Assert.assertEquals(5, resultAddZeroToPositive, 0);
        Assert.assertEquals(-5, resultAddNegativeToZero, 0);
        Assert.assertEquals(-5, resultAddZeroToNegative, 0);
    }

    @Test
    public void testCalculationsSubtract() {
        //Given

        //When
        double resultSubtractPositiveToZero = calculator.sub(5, 0);
        double resultSubtractZeroToPositive = calculator.sub(0, 5);
        double resultSubtractNegativeToZero = calculator.sub(-5, 0);
        double resultSubtractZeroToNegative = calculator.sub(0, -5);

        //Then
        Assert.assertEquals(5, resultSubtractPositiveToZero, 0);
        Assert.assertEquals(-5, resultSubtractZeroToPositive, 0);
        Assert.assertEquals(-5, resultSubtractNegativeToZero, 0);
        Assert.assertEquals(5, resultSubtractZeroToNegative, 0);
    }

    @Test
    public void testCalculationsMultiply() {
        //Given

        //When
        double resultMultiplyPositiveToZero = calculator.mul(5, 0);
        double resultMultiplyZeroToPositive = calculator.mul(0, 5);
        double resultMultiplyNegativeToZero = calculator.mul(-5, 0);
        double resultMultiplyZeroToNegative = calculator.mul(0, -5);

        //Then
        Assert.assertEquals(0, resultMultiplyZeroToPositive, 0);
        Assert.assertEquals(0, resultMultiplyPositiveToZero, 0);
        Assert.assertEquals(0, resultMultiplyZeroToNegative, 0);
        Assert.assertEquals(0, resultMultiplyNegativeToZero, 0);
    }

    @Test
    public void testCalculationsDivide() {
        //Given

        //When
        double resultDivideZeroByNegative = calculator.div(0, -5);
        double resultDivideNegativeByZero = calculator.div(-5, 0);
        double resultDivideZeroByPositive = calculator.div(0, 5);
        double resultDividePositiveByZero = calculator.div(5, 0);

        //Then
        Assert.assertEquals(0, resultDivideZeroByNegative, 0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, resultDivideNegativeByZero, 0);
        Assert.assertEquals(0, resultDivideZeroByPositive, 0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, resultDividePositiveByZero, 0);
    }

}
