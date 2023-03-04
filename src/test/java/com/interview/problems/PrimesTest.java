package com.interview.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimesTest {

    @Test
    public void getLargestPrimeFactor() {
        assertEquals(5, LargestPrimeFactor.getLargestPrimeFactor(15));
        assertEquals(7, LargestPrimeFactor.getLargestPrimeFactor(49));
        assertEquals(2, LargestPrimeFactor.getLargestPrimeFactor(2));
        assertEquals(-1, LargestPrimeFactor.getLargestPrimeFactor(1));
    }
}