package com.kodilla.testing.shapes;

import org.junit.*;
import com.kodilla.testing.shapes.*;

import java.util.ArrayList;

//Test suite for ShapeCollector
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test finished");
    }

    @Test
    public void testAddFigure(){
        //Given
        Circle circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Circle circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.shapeArrayList.size());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        Shape shapeFromList = shapeCollector.getFigure(1);

        //Then
        Assert.assertEquals(square, shapeFromList);
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        ArrayList<Shape> testingList = new ArrayList<>();
        testingList.add(circle);
        testingList.add(square);
        testingList.add(triangle);
        //When
        ArrayList<Shape> result = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(testingList, result);
    }
}
