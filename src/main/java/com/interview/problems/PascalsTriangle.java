package com.interview.problems;

public class PascalsTriangle {

    /**
     * Prints Pascal Triangle
     * @param n Nth row of Pascal's triangle
     * @return returns a text block representing Pascal's triangle to the Nth row
     */
    public static String printPascalTriangle(int n) {
        StringBuilder sb = new StringBuilder();
        Integer[][] triangle = getPascalTriangle(n);
        for (int i = 0; i < triangle.length; i++) {
            sb.append(" ".repeat(n - i));
            for (int j = 0; j < triangle[i].length; j++) {
                sb.append(triangle[i][j]);
                if (j + 1 != triangle[i].length) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Create the pascal triangle through a matrix
     * @param n Nth row of Pascal's triangle
     * @return retuns a matrix representing Pascal's triangle to the Nth row
     */
    public static Integer[][] getPascalTriangle(int n) {
        if (n < 0) {
            return new Integer[][]{};
        }

        if (n == 0) {
            return new Integer[][]{{1}};
        }

        var triangle = new Integer[n + 1][];
        for (int line = 0; line <= n; line++) {
            var row = new Integer[line + 1];
            for (int i = 0; i <= line ; i++) {
                if (i == 0 || i == line) {
                    row[i] = 1;
                } else {
                    row[i] = triangle[line - 1][i - 1] + triangle[line - 1][i];
                }
            }
            triangle[line] = row;
        }
        return triangle;
    }

    /**
     * Create the pascal triangle through a matrix, using Binomial Expansion/Theorem (https://en.wikipedia.org/wiki/Binomial_theorem)
     * @param n Nth row of Pascal's triangle
     * @return retuns a matrix representing Pascal's triangle to the Nth row
     */
    public static Integer[][] withBinomialExpansion(int n) {
        var triangle = new Integer[n + 1][];
        for (int line = 1; line <= n+1; line++) {
            var row = new Integer[line];
            int k = 1;
            for (int i = 1; i <= line; i++) {
                row[i-1] = k;
                k = k * (line - i) / i;
            }
            triangle[line-1] = row;
        }
        return triangle;
    }
}
