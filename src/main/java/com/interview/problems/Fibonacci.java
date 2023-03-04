package com.interview.problems;

public class Fibonacci {

    /**
     * Generate a Fibonnaci Sequece
     *
     * @param n the number of Fibonacci numbers to generate
     * @return an array of fibonacci sequence
     */
    public static Integer[] fibonacci(int n) {
        Integer[] acc = new Integer[n];
        return fibonacci(acc, n);
    }

    private static Integer[] fibonacci(Integer[] acc, int n) {
        if (n == 1) {
            acc[n - 1] = 1;
            return acc;
        }

        if (n == 2) {
            acc[n - 1] = 1;
            return fibonacci(acc, n - 1);
        }

        acc[n - 1] = fibonacci(acc, n - 1)[n - 2] + fibonacci(acc, n - 1)[n - 3];
        return acc;
    }
}
