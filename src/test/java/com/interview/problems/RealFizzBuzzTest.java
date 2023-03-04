package com.interview.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RealFizzBuzzTest {

    @Test
    void realFizzBuzz() {
        String expected = """
        1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz
        [lucky=2, integer=10, fizzbuzz=1, fizz=4, buzz=3]""";
        assertEquals(expected, RealFizzBuzz.realFizzBuzz(20));
    }
}