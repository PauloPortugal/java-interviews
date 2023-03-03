package com.interview.problems;

import junit.framework.TestCase;

public class PrimesTest extends TestCase {

    LargestPrimeFactor primes = new LargestPrimeFactor();

    public void testGetLargestPrimeFactor() {
        assertEquals(5, primes.getLargestPrimeFactor(15));
        assertEquals(7, primes.getLargestPrimeFactor(49));
        assertEquals(2, primes.getLargestPrimeFactor(2));
        assertEquals(-1, primes.getLargestPrimeFactor(1));
    }
}