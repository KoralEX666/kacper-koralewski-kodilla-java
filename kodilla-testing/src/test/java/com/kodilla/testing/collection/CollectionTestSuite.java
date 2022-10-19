package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.kodilla.testing.collection.OddNumbersExterminator.*;

public class CollectionTestSuite{
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
        System.out.println("");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

   // @DisplayName("when create SimpleUser with realName, " +
    //        "then getRealName should return real user name"

    @DisplayName("When create empty list, then exterminate should return empty list with extra \"Empty list\" information.")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> testSampleEmpty = new ArrayList<>();
        //When
        List<Integer> resultEmpty = exterminate(testSampleEmpty);
        System.out.println("Result " + resultEmpty);
        //Then
        Assertions.assertEquals(testSampleEmpty, resultEmpty);
    }

    @DisplayName("When create sample list with few numbers, then exterminate should return list without odd numbers. Normal version.")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> testSample = new ArrayList<>();
        testSample.add(2075);
        testSample.add(1235);
        testSample.add(1250);
        testSample.add(1980);
        //When
        List<Integer> result = exterminate(testSample);
        System.out.println("Result " + result);
        //Then
        List<Integer> expectedResult = Arrays.asList(1250, 1980);
        Assertions.assertEquals(expectedResult, result);
    }
    @DisplayName("When create sample list with few numbers, then exterminate should return list without odd numbers. Array.asList() version.")
    @Test
    void testOddNumbersExterminatorNormalListArraysAsList() {
        //Given
        List<Integer> testSample = Arrays.asList(1548, 2353, 5648, 4681);
        //When
        List<Integer> result = exterminate(testSample);
        System.out.println("Result " + result);
        //Then
        List<Integer> expectedResult = Arrays.asList(1548, 5648);
        Assertions.assertEquals(expectedResult, result);
    }
}
