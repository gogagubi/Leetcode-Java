package com.leetcode.example.dinamicprogramming;


public class _62_UniquePaths {
    public static void main(String[] args) {
        if (true) {
            _62_UniquePaths c = new _62_UniquePaths();
            int m = 3, n = 7;

            System.out.println("Result " + c.uniquePaths(m, n));
        }

        if (true) {
            _62_UniquePaths c = new _62_UniquePaths();
            int m = 3, n = 2;

            System.out.println("Result " + c.uniquePaths(m, n));
        }

        if (true) {
            _62_UniquePaths c = new _62_UniquePaths();
            int m = 7, n = 3;

            System.out.println("Result " + c.uniquePaths(m, n));
        }

        if (true) {
            _62_UniquePaths c = new _62_UniquePaths();
            int m = 3, n = 3;

            System.out.println("Result " + c.uniquePaths(m, n));
        }
    }

    public int uniquePaths(int m, int n) {
        int[][]grid = new int[m][n];
        grid[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                int left = j > 0 ? grid[i][j - 1] : 0;
                int right = i > 0 ? grid[i - 1][j] : 0;

                grid[i][j] += left + right;

            }
        }

        return grid[m - 1][n - 1];
    }


}
