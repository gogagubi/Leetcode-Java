package com.leetcode.example.string;

public class _680_ValidPalindromeII {
    public static void main(String[] args) {
        if (false) {
            _680_ValidPalindromeII c = new _680_ValidPalindromeII();

            String s = "aba";
            System.out.println("Valid palindrome " + c.validPalindrome(s));
        }

        if (false) {
            _680_ValidPalindromeII c = new _680_ValidPalindromeII();

            String s = "abca";
            System.out.println("Valid palindrome " + c.validPalindrome(s));
        }

        if (false) {
            _680_ValidPalindromeII c = new _680_ValidPalindromeII();

            String s = "cbbcc";
            System.out.println("Valid palindrome " + c.validPalindrome(s));
        }

        if (false) {
            _680_ValidPalindromeII c = new _680_ValidPalindromeII();

            String s = "eccer";
            System.out.println("Valid palindrome " + c.validPalindrome(s));
        }

        if (false) {
            _680_ValidPalindromeII c = new _680_ValidPalindromeII();

            String s = "deeee";
            System.out.println("Valid palindrome " + c.validPalindrome(s));
        }

        if (true) {
            _680_ValidPalindromeII c = new _680_ValidPalindromeII();

            String s = "ebcbbececabbacecbbcbe";
            System.out.println("Valid palindrome " + c.validPalindrome(s));
        }
    }

    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return validPalindrome(s, left + 1, right)
                        || validPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    public boolean validPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }

        return true;
    }

}
