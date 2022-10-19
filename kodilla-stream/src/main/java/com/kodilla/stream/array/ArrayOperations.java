package com.kodilla.stream.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream
                .range(0, numbers.length)
                .forEach(i -> System.out.println((int)Array.get(numbers, i)));

        double averageTest;
        return averageTest = Arrays.stream(numbers)
                .average()
                .orElse(Double.NaN);
    }
}
