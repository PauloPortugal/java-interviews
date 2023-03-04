package com.interview.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberCheckTest {

    @Test
    public void isPrimeNumber() {
        assertTrue(PrimeNumberCheck.isPrimeNumber(2));
        assertTrue(PrimeNumberCheck.isPrimeNumber(3));
        assertTrue(PrimeNumberCheck.isPrimeNumber(5));
        assertTrue(PrimeNumberCheck.isPrimeNumber(17));
        assertTrue(PrimeNumberCheck.isPrimeNumber(8_191));

        assertFalse(PrimeNumberCheck.isPrimeNumber(4));
        assertFalse(PrimeNumberCheck.isPrimeNumber(6));
        assertFalse(PrimeNumberCheck.isPrimeNumber(10));
        assertFalse(PrimeNumberCheck.isPrimeNumber(15));
    }
}