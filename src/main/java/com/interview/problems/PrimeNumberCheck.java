package com.interview.problems;

import java.util.stream.IntStream;

public class PrimeNumberCheck {

    /**
     * Check if the provided input is a prime input
     *
     * @param input an integer number
     * @return true if input is a prime number
     */
    public static boolean isPrimeNumber(int input) {
        if (input == 1 || input == 2) {
            return true;
        }

        return !IntStream.range(2, input - 1).anyMatch(n -> input % n == 0);
    }
}
