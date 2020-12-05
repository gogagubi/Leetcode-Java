package com.leetcode.example.string;

public class _409_LongestPalindrome {
    public static void main(String[] args) {
        if (true) {
            _409_LongestPalindrome c = new _409_LongestPalindrome();

            String s = "abccccdd";
            System.out.println("Longest palindrome " + c.longestPalindrome(s));
        }

        if (false) {
            _409_LongestPalindrome c = new _409_LongestPalindrome();

            String s = "AAAAAA";
            System.out.println("Longest palindrome " + c.longestPalindrome(s));
        }

        if (false) {
            _409_LongestPalindrome c = new _409_LongestPalindrome();

            String s = "tattarrattat";
            System.out.println("Longest palindrome " + c.longestPalindrome(s));
        }

        if (false) {
            _409_LongestPalindrome c = new _409_LongestPalindrome();

            String s = "zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez";
            System.out.println("Longest palindrome " + c.longestPalindrome(s));
        }
    }

    public int longestPalindrome(String s) {
        int[] charCounts = new int['z' - 'A' + 1];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'A']++;
        }

        int result = 0;
        for (int charCount : charCounts) {
            result += charCount / 2 * 2;
            if (result % 2 == 0 && charCount % 2 == 1) {
                result += 1;
            }
        }

        return result;
    }


}
