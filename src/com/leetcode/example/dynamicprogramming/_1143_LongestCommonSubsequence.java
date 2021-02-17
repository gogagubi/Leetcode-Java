package com.leetcode.example.dynamicprogramming;


public class _1143_LongestCommonSubsequence {
    public static void main(String[] args) {
        if (true) {
            _1143_LongestCommonSubsequence s = new _1143_LongestCommonSubsequence();
            String text1 = "abcde";
            String text2 = "ace";

            System.out.println("Result " + s.longestCommonSubsequence(text1, text2));
        }

        if (true) {
            _1143_LongestCommonSubsequence s = new _1143_LongestCommonSubsequence();
            String text1 = "abcde";
            String text2 = "acre";

            System.out.println("Result " + s.longestCommonSubsequence(text1, text2));
        }

        if (true) {
            _1143_LongestCommonSubsequence s = new _1143_LongestCommonSubsequence();
            String text1 = "bsbininm";
            String text2 = "jmjkbkjkv";

            System.out.println("Result " + s.longestCommonSubsequence(text1, text2));
        }
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length() + 1;
        int m = text2.length() + 1;

        int[][] dp = new int[n][m];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }

        return dp[n - 1][m - 1];
    }

}
