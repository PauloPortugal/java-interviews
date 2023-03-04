package com.interview.problems;

public class Factorial {

    /**
     * Generate a factorial of n
     *
     * @param n the factorial
     * @return the result
     */
    public static int of(int n) {
        return factorial(0, n);
    }

    private static int factorial(int acc, int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(acc, n - 1);
    }
}
