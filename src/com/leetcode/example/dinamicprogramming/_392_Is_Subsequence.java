package com.leetcode.example.dinamicprogramming;


public class _392_Is_Subsequence {
    public static void main(String[] args) {
        if (true) {
            _392_Is_Subsequence c = new _392_Is_Subsequence();
            String s = "abc";
            String t = "ahbgdc";

            System.out.println("Result " + c.isSubsequence(s, t));
        }

        if (true) {
            _392_Is_Subsequence c = new _392_Is_Subsequence();
            String s = "axc";
            String t = "ahbgdc";

            System.out.println("Result " + c.isSubsequence(s, t));
        }
    }

    public boolean isSubsequence(String s, String t) {
        boolean[][] dp = new boolean[s.length() + 1][t.length() + 1];

        for (int j = 0; j <= t.length(); j++) {
            dp[0][j] = true;
        }

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[s.length()][t.length()];
    }

    public boolean isSubsequence1(String s, String t) {
        int ind = 0;

        for (int i = 0; i < t.length(); i++) {
            if (ind == s.length()) break;
            if (t.charAt(i) == s.charAt(ind)) {
                ind++;
            }
        }


        return ind == s.length();
    }


}
