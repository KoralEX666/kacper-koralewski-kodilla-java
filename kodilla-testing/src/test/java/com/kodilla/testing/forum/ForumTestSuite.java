package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;

import org.junit.jupiter.api.*;

class ForumTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create SimpleUser with realName, " +
            "then getRealName should return real user name"
    )
    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("John Smith", result);
    }

    @DisplayName("when create SimpleUser with name, " +
            "then getUsername should return correct name"
    )
    @Test
    void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String expectedResult = "theForumUser";

        //When
        String result = simpleUser.getUsername();
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}

/*
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("User - test OK");
        } else {
            System.out.println("User - test status Error!");
        }

        Calculator addTest = new Calculator(5, 7);
        int addResult = addTest.add();
        if (addResult==12) {
            System.out.println("Calculator - Adding test OK");
        } else {
            System.out.println("Calculator - Adding test FAILS");
        }

        Calculator subtractTest = new Calculator(7, 5);
        int subtractResult = subtractTest.subtract();
        if (subtractResult==2) {
            System.out.println("Calculator - Subtract test OK");
        } else {
            System.out.println("Calculator - Subtract test FAILS");
        }
 */