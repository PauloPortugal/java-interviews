package com.interview.problems;

import junit.framework.TestCase;

public class PalindromeTest extends TestCase {

    Palindrome palindrome = new Palindrome();

    public void testIsPalindrome() {
        assertTrue(palindrome.isPalindrome(101));
        assertTrue(palindrome.isPalindrome(-101));
        assertTrue(palindrome.isPalindrome(1));
        assertTrue(palindrome.isPalindrome(0));
        assertTrue(palindrome.isPalindrome(1010101));

        assertFalse(palindrome.isPalindrome(123));
    }

    public void testTestIsPalindrome() {
        assertTrue(palindrome.isPalindrome("Bob"));
        assertFalse(palindrome.isPalindrome("cat"));
        assertFalse(palindrome.isPalindrome("zoRRO"));
        assertFalse(palindrome.isPalindrome(""));
    }

    public void testDegreeOfPalindrome() {
        assertEquals("100%", palindrome.degreeOfPalindrome("Bob"));
        assertEquals("33%", palindrome.degreeOfPalindrome("cat"));
        assertEquals("20%", palindrome.degreeOfPalindrome("zoRRo"));
        assertEquals("14%", palindrome.degreeOfPalindrome("Barbara"));
        assertEquals("0%", palindrome.degreeOfPalindrome("John"));
        assertEquals("0%", palindrome.degreeOfPalindrome(""));
    }
}