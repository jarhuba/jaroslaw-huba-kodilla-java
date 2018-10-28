package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    static int count = 0;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Start test suite:");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("FINISHED ALL TESTS");
    }

    @Before
    public void before() {
        count++;
        System.out.println("Start test: " + count);
    }

    @After
    public void after() {
        System.out.println("End test.");
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape square = new Square(10);
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(10,15);
        ShapeCollector collector = new ShapeCollector();
        //When
        collector.addFigure(square);
        collector.addFigure(triangle);
        collector.addFigure(circle);
        //Then
        Assert.assertEquals(square, collector.getFigure(0));
        Assert.assertEquals(triangle, collector.getFigure(1));
        Assert.assertEquals(circle, collector.getFigure(2));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape square = new Square(10);
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(10,15);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(square);
        collector.addFigure(triangle);
        collector.addFigure(circle);
        //When
        collector.removeFigure(square);
        //Then
        Assert.assertEquals(triangle, collector.getFigure(0));
        Assert.assertEquals(circle, collector.getFigure(1));
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape square = new Square(10);
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(10,15);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(square);
        collector.addFigure(triangle);
        collector.addFigure(circle);
        //When
        Shape figure = collector.getFigure(0);
        //Then
        Assert.assertEquals(square, figure);
    }

    @Test
    public void testShowFigures() {
        //Given
        Shape square = new Square(10);
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(10,15);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(square);
        collector.addFigure(triangle);
        collector.addFigure(circle);
        //When
        String expectedMessage = "square triangle circle";
        String message = collector.showFigures();
        //Than
        Assert.assertEquals(expectedMessage, message);
    }
}
