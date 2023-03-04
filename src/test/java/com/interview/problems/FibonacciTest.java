package com.interview.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci() {
        assertEquals(Arrays.toString(new Integer[]{1, 1}), Arrays.toString(Fibonacci.fibonacci(2)));
        assertTrue(Arrays.deepEquals(new Integer[]{1, 1, 2}, Fibonacci.fibonacci(3)));
        assertTrue(Arrays.deepEquals(new Integer[]{1, 1, 2, 3, 5}, Fibonacci.fibonacci(5)));
        assertTrue(Arrays.deepEquals(new Integer[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, Fibonacci.fibonacci(10)));
    }
}