package com.interview.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void isIntegerPalindrome() {
        assertTrue(Palindrome.isPalindrome(101));
        assertTrue(Palindrome.isPalindrome(-101));
        assertTrue(Palindrome.isPalindrome(1));
        assertTrue(Palindrome.isPalindrome(0));
        assertTrue(Palindrome.isPalindrome(1010101));

        assertFalse(Palindrome.isPalindrome(123));
    }

    @Test
    public void isStringPalindrome() {
        assertTrue(Palindrome.isPalindrome("Bob"));
        assertFalse(Palindrome.isPalindrome("cat"));
        assertFalse(Palindrome.isPalindrome("zoRRO"));
        assertFalse(Palindrome.isPalindrome(""));
    }

    @Test
    public void degreeOfPalindrome() {
        assertEquals("100%", Palindrome.degreeOfPalindrome("Bob"));
        assertEquals("33%", Palindrome.degreeOfPalindrome("cat"));
        assertEquals("20%", Palindrome.degreeOfPalindrome("zoRRo"));
        assertEquals("14%", Palindrome.degreeOfPalindrome("Barbara"));
        assertEquals("0%", Palindrome.degreeOfPalindrome("John"));
        assertEquals("0%", Palindrome.degreeOfPalindrome(""));
    }
}