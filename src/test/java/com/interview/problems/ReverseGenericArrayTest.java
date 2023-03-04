package com.interview.problems;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collections;

public class ReverseGenericArrayTest extends TestCase {


    public void testReverse() throws InstantiationException, IllegalAccessException {
        ReverseGenericArray<Integer> integerArray = new ReverseGenericArray<>();
        assertTrue(Arrays.deepEquals(new Integer[]{3, 0, 9, 8}, integerArray.reverse(new Integer[]{8, 9, 0, 3})));
        assertTrue(Arrays.deepEquals(new Integer[]{3}, integerArray.reverse(new Integer[]{3})));
        assertTrue(Arrays.deepEquals(null, integerArray.reverse(new Integer[]{})));

        ReverseGenericArray<String> stringArray = new ReverseGenericArray<>();
        assertTrue(Arrays.deepEquals(new String[]{"3", "0", "9", "8"}, stringArray.reverse(new String[]{"8", "9", "0", "3"})));
    }
}