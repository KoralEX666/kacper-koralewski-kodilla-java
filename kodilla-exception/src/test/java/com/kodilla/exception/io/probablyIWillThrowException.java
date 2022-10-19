package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import org.junit.jupiter.api.Test;
import com.kodilla.exception.test.SecondChallenge;

import static org.junit.jupiter.api.Assertions.*;

public class probablyIWillThrowException {
    @Test
    void testSecondChallengeAllinRange() {
        // given
        SecondChallenge  testString = new SecondChallenge();

        //when & then
        assertDoesNotThrow(() -> testString.probablyIWillThrowException(1.5, 2));
    }
    @Test
    void testSecondChallengeBoundaryConditionsXHigherThanTwo() {
        // given
        SecondChallenge  testString = new SecondChallenge();

        //when & then
        assertThrows(Exception.class, () -> testString.probablyIWillThrowException(5, 2));
    }
    @Test
    void testSecondChallengeBoundaryConditionsXLowerThanOne() {
        // given
        SecondChallenge  testString = new SecondChallenge();

        //when & then
        assertThrows(Exception.class, () -> testString.probablyIWillThrowException(0.5, 2));
    }
    @Test
    void testSecondChallengeBoundaryConditionsYEqualsOnePointFife() {
        // given
        SecondChallenge  testString = new SecondChallenge();

        //when & then
        assertThrows(Exception.class, () -> testString.probablyIWillThrowException(1.5, 1.5));
    }


}
