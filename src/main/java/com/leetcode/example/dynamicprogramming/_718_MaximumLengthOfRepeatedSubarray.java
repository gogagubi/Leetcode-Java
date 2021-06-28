package com.leetcode.example.dynamicprogramming;


public class _718_MaximumLengthOfRepeatedSubarray {
    public static void main(String[] args) {
        if (true) {
            _718_MaximumLengthOfRepeatedSubarray o = new _718_MaximumLengthOfRepeatedSubarray();
            int[] A = {1, 2, 3, 2, 1};
            int[] B = {3, 2, 1, 4, 7};

            System.out.println("Result " + o.findLength(A, B));
        }
    }

    public int findLength(int[] A, int[] B) {
        int ans = 0;
        int n = A.length + 1;
        int m = B.length + 1;

        int[][] dp = new int[n][m];
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }

                ans = Math.max(ans, dp[i][j]);
            }
        }

        return ans;
    }

}
