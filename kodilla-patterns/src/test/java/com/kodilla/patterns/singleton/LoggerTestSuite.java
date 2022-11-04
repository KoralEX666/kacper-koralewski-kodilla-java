package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void  startLog(){
        logger = Logger.INSTANCE;
    }

    @Test
    void testGetLastLogOne(){

        //Given
        //When
        logger.log("test log one");
        logger.log("test log two");
        logger.log("test log three");

        //Then
        System.out.println("Last log is: " + logger.getLastLog());
        assertEquals("test log three", logger.getLastLog());

    }
    @Test
    void testGetLastLogTwo(){

        //Given
        //When
        logger.log("test log four");
        logger.log("test log five");
        logger.log("test log six");

        //Then
        System.out.println("Last log is: " + logger.getLastLog());
        assertEquals("test log six", logger.getLastLog());

    }
    @Test
    void testGetLastLogThree(){

        //Given
        //When
        logger.log("test log bla");
        logger.log("test log blabla");
        logger.log("test log blablabla");

        //Then
        System.out.println("Last log is: " + logger.getLastLog());
        assertEquals("test log blablabla", logger.getLastLog());

    }




}
