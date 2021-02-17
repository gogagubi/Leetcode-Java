package com.leetcode.example.dynamicprogramming;


import java.util.Arrays;

public class _5_LongestPalindromicSubstring {
    public static void main(String[] args) {
        if (false) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "babad";

            System.out.println("Result " + o.longestPalindrome(s));
        }

        if (false) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "cbbd";

            System.out.println("Result " + o.longestPalindrome(s));
        }

        if (false) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "a";

            System.out.println("Result " + o.longestPalindrome(s));
        }

        if (false) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "ac";

            System.out.println("Result " + o.longestPalindrome(s));
        }

        if (false) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "aacabdkacaa";

            System.out.println("Result " + o.longestPalindrome(s)); //"aca"
        }

        if (false) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "bb";

            System.out.println("Result " + o.longestPalindrome(s));
        }

        if (false) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "abacdgfdcaba";

            System.out.println("Result " + o.longestPalindrome(s));
        }

        if (true) {
            _5_LongestPalindromicSubstring o = new _5_LongestPalindromicSubstring();
            String s = "dabaas";

            System.out.println("Result " + o.longestPalindrome(s)); //"aca"
        }
    }

    private String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";

        int l = 0, r = 0;

        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (i == j) {
                    dp[i][j] = true;
                } else if (i - j == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i - 1][j + 1];
                }

                if (dp[i][j] && i - j > r - l) {
                    l = j;
                    r = i;
                }
            }
        }

        return s.substring(l, r + 1);
    }


}
