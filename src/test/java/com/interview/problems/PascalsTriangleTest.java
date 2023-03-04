package com.interview.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PascalsTriangleTest {

    @Test
    public void printPascalTriangle() {
        var n1 = """
                 1
                1 1
                """;
        assertEquals(n1, PascalsTriangle.printPascalTriangle(1));
        var n5 = """
                     1
                    1 1
                   1 2 1
                  1 3 3 1
                 1 4 6 4 1
                1 5 10 10 5 1
                """;
        assertEquals(n5, PascalsTriangle.printPascalTriangle(5));
    }

    @Test
    public void getPascalTriangle() {
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}}, PascalsTriangle.getPascalTriangle(0)));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1, 1}}, PascalsTriangle.getPascalTriangle(1)));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1,1}, {1,2,1}}, PascalsTriangle.getPascalTriangle(2)));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1}, {1,5,10,10,5,1}}, PascalsTriangle.getPascalTriangle(5)));
    }

    @Test
    public void useBinomialExpansion() {
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}}, PascalsTriangle.withBinomialExpansion(0)));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1, 1}}, PascalsTriangle.withBinomialExpansion((1))));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1,1}, {1,2,1}}, PascalsTriangle.withBinomialExpansion(2)));
        assertTrue(Arrays.deepEquals(new Integer[][]{{1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1}, {1,5,10,10,5,1}}, PascalsTriangle.withBinomialExpansion(5)));
    }
}