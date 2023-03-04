package com.interview.problems;

import java.util.stream.IntStream;

public class Palindrome {

    /**
     * Check if the integer provided is a palindrome
     *
     * @param number number to test if is palindrome
     * @return true if is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        if (number > 0 && number < 10) {
            return true;
        }

        int reverse = 0;
        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            reverse = reverse * 10 + lastDigit;
        }
        return number == reverse;
    }

    /**
     *
     * @param word the provided input
     * @return true if is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String word) {
        if (word == null || word.trim().length() == 0) {
            return false;
        }

        String lcWord = word.toLowerCase();
        String reversedWord = new StringBuilder(lcWord).reverse().toString();
        return lcWord.equals(reversedWord);
    }

    /**
     * Check how close the string is from being a palindrome.
     * For examples 'Bob' should return '100%' since it is a palindrome word, 'cat' should return '33%'
     * and 'John' should return '0%'.
     *
     * @param word the provided input
     * @return true if is a palindrome, false otherwise
     */
    public static String degreeOfPalindrome(String word) {
        if (word == null || word.trim().length() == 0) {
            return "0%";
        }
        String percentage = "%";
        String lcWord = word.toLowerCase();
        String rWord = new StringBuilder(lcWord).reverse().toString();
        double totalMatching = IntStream.range(0, word.length())
                .filter(i -> rWord.charAt(i) == lcWord.charAt(i))
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
                .length();

        return Double.valueOf(totalMatching / word.length() * 100.0).intValue() + percentage;
    }
}
