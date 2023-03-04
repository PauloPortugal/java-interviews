package com.interview.problems;

import junit.framework.TestCase;

public class PrimeNumberCheckTest extends TestCase {

    public void testIsPrimeNumber() {
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