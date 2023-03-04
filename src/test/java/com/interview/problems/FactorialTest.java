package com.interview.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial() {
        assertEquals(1, Factorial.of(1));
        assertEquals(2, Factorial.of(2));
        assertEquals(6, Factorial.of(3));
        assertEquals(24, Factorial.of(4));
        assertEquals(120, Factorial.of(5));
    }
}