package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderBasicGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        //When
        BigDecimal calculatedCost = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testPizzaOrderBasicGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza", description);
    }

    @Test
    public void testCheesDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new CheesDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(16), thePrice);
    }

    @Test
    public void testCheesDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new CheesDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza + ser", description);
    }

    @Test
    public void testHamDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new CheesDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(16), thePrice);
    }

    @Test
    public void testHamDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new HamDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza + szynka", description);
    }

    @Test
    public void testMushroomsDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new MushroomsDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(16), thePrice);
    }

    @Test
    public void testMushroomsDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new MushroomsDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza + pieczarki", description);
    }

    @Test
    public void testPanThickDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PanThickDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(16), thePrice);
    }

    @Test
    public void testPanThickDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PanThickDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza + grube ciasto", description);
    }

    @Test
    public void testPaprikaDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PaprikaDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(16), thePrice);
    }

    @Test
    public void testPaprikaDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PaprikaDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza + papryka", description);
    }

    @Test
    public void testPizzaWithPanThickAndHamAndCheeseDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PanThickDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new CheesDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(19), thePrice);
    }

    @Test
    public void testPizzaWithHamAndCheeseDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new PanThickDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new CheesDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza + grube ciasto + szynka + ser", description);
    }

    @Test
    public void testPizzaWithMushroomsAndPaprikaDecoratorGetPrice() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PaprikaDecorator(theOrder);
        //When
        BigDecimal thePrice = theOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(17), thePrice);
    }

    @Test
    public void testPizzaWithMushroomsAndPaprikaDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new PizzaOrderBasic();
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PaprikaDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza + pieczarki + papryka", description);
    }
}
