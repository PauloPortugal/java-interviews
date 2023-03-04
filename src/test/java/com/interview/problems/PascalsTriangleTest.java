package com.interview.problems;

import junit.framework.TestCase;

import java.util.Arrays;

public class PascalsTriangleTest extends TestCase {

    PascalsTriangle pascalsTriangle = new PascalsTriangle();

    public void testPrintPascalTriangle() {
        var n1 = """
                 1
                1 1
                """;
        assertEquals(n1, pascalsTriangle.printPascalTriangle(1));
        var n5 = """
                     1
                    1 1
                   1 2 1
                  1 3 3 1
                 1 4 6 4 1
                1 5 10 10 5 1
                """;
        assertEquals(n5, pascalsTriangle.printPascalTriangle(5));
    }

    public void testGetPascalTriangle() {
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}}, pascalsTriangle.getPascalTriangle(0)));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1, 1}}, pascalsTriangle.getPascalTriangle(1)));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1,1}, {1,2,1}}, pascalsTriangle.getPascalTriangle(2)));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1}, {1,5,10,10,5,1}}, pascalsTriangle.getPascalTriangle(5)));
    }

    public void testUseBinomialExpansion() {
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}}, pascalsTriangle.useBinomialExpansion(0)));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1, 1}}, pascalsTriangle.useBinomialExpansion((1))));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1,1}, {1,2,1}}, pascalsTriangle.useBinomialExpansion(2)));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1}, {1,5,10,10,5,1}}, pascalsTriangle.useBinomialExpansion(5)));
    }
}