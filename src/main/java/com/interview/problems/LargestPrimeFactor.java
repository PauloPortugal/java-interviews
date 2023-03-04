package com.interview.problems;

public class LargestPrimeFactor {

    /**
     * Calculate the largest prime factor of a given number
     *
     * @param input an integer
     * @return the larges prime factor of a given number
     */
    public static int getLargestPrimeFactor(int input) {
        int i;
        long inputCopy = input;

        if (input < 2) {
            return -1;
        }

        for (i = 2; i <= inputCopy; i++) {
            if (inputCopy % i == 0) {
                inputCopy /= i;
                i--;
            }
        }

        return i;
    }
}
