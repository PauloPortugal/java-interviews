package com.interview.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReverseGenericArrayTest {

    @Test
    public void reverse() throws InstantiationException, IllegalAccessException {
        assertTrue(Arrays.deepEquals(new Integer[]{3, 0, 9, 8}, ReverseGenericArray.reverse(new Integer[]{8, 9, 0, 3})));
        assertTrue(Arrays.deepEquals(new Integer[]{3}, ReverseGenericArray.reverse(new Integer[]{3})));
        assertTrue(Arrays.deepEquals(null, ReverseGenericArray.reverse(new Integer[]{})));

        assertTrue(Arrays.deepEquals(new String[]{"3", "0", "9", "8"}, ReverseGenericArray.reverse(new String[]{"8", "9", "0", "3"})));
    }
}