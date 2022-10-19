package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector.*;
import com.kodilla.testing.shape.Shape.*;
import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Nested
    @DisplayName("Tests for existing figures")
    class TestExistingFigures {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector testShape = new ShapeCollector("square", 15);
            //When
            boolean result = testShape.addFigure(testShape);
            //Then
            Assertions.assertTrue(result);
        }
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector testShape = new ShapeCollector("square", 15);
            testShape.addFigure(testShape);
            //When
            boolean result = testShape.removeFigure(testShape);
            //Then
            Assertions.assertTrue(result);
        }
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector testShape = new ShapeCollector("square", 15);
            testShape.addFigure(testShape);
            //When
            Shape result = testShape.getFigure(0);
            //Then
            Assertions.assertEquals(testShape, result);
        }
        @Test
        void testShowFigureS() {
            //Given
            ShapeCollector testShapeOne = new ShapeCollector("square", 15);
            testShapeOne.addFigure(testShapeOne);
            ShapeCollector testShapeTwo = new ShapeCollector("triangle", 15);
            testShapeOne.addFigure(testShapeTwo);
            ShapeCollector testShapeTree = new ShapeCollector("circle", 15);
            testShapeOne.addFigure(testShapeTree);
            //When
            String result = testShapeOne.showFigures();
            //Then
            Assertions.assertEquals("square, triangle, circle", result);
        }
    }

    @Nested
    @DisplayName("Tests for non-existing figures")
    class TestNonExistingFigure {
        @Test
        void testAddNonExistingFigure() {
            //Given
            ShapeCollector testShape = new ShapeCollector("Cat", 15);
            //When
            boolean result = testShape.addFigure(testShape);
            //Then
            Assertions.assertFalse(result);
        }
        @Test
        void testRemoveNonExistingFigure() {
            //Given
            ShapeCollector testShape = new ShapeCollector("square", 15);
            testShape.addFigure(testShape);
            ShapeCollector testNonExistingShape = new ShapeCollector("cat", 15);
            //When
            boolean result = testShape.removeFigure(testNonExistingShape);
            //Then
            Assertions.assertFalse(result);
        }
        @Test
        void testGetNonExistingFigure() {
            //Given
            ShapeCollector testShape = new ShapeCollector("square", 15);
            testShape.addFigure(testShape);
            //When
            Shape result = testShape.getFigure(15);
            //Then
            Assertions.assertEquals(null, result);
        }
        @Test
        void testShowNonExistingFigureS() {
            //Given
            ShapeCollector testShapeOne = new ShapeCollector("dog", 15);
            testShapeOne.addFigure(testShapeOne);
            ShapeCollector testShapeTwo = new ShapeCollector("mouse", 15);
            testShapeOne.addFigure(testShapeTwo);
            ShapeCollector testShapeTree = new ShapeCollector("elephant", 15);
            testShapeOne.addFigure(testShapeTree);
            ShapeCollector testShapeCat = new ShapeCollector("cat", 15);
            testShapeOne.addFigure(testShapeCat);
            //When
            String result = testShapeOne.showFigures();
            //Then
            Assertions.assertEquals("", result);
        }
    }
}

