package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[]{4,6,8,1,3,8,3,1,4,5,7,2,5};

        //When
        double averageOfNumbers = getAverage(numbers);

        //Then
        assertEquals(4.38, averageOfNumbers, 0.005);

    }
}
