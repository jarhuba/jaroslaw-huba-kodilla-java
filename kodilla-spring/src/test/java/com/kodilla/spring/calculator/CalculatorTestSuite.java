package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultAdd = calculator.add(3, 5);
        double resultSub = calculator.sub(3, 5);
        double resultMul = calculator.mul(3, 5);
        double resultDiv = calculator.div(3, 5);
        double resultMulZero = calculator.mul(3, 0);
        double resultDivZero = calculator.div(3, 0);
        double resultDivZeroMinus = calculator.div(-3, 0);
        double resultAddMinus = calculator.add(-3, -5);
        double resultSubMinus = calculator.sub(-3, -5);

        //Then
        Assert.assertEquals(8, resultAdd, 0);
        Assert.assertEquals(-2, resultSub, 0);
        Assert.assertEquals(15, resultMul, 0);
        Assert.assertEquals(0.6, resultDiv, 0.00001);
        Assert.assertEquals(0, resultMulZero, 0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, resultDivZero, 0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, resultDivZeroMinus, 0);
        Assert.assertEquals(-8, resultAddMinus, 0);
        Assert.assertEquals(2, resultSubMinus, 0);
    }
}
