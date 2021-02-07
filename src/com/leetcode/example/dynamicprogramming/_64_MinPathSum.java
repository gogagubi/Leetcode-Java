package com.leetcode.example.dynamicprogramming;


public class _64_MinPathSum {
    public static void main(String[] args) {
        if (true) {
            _64_MinPathSum c = new _64_MinPathSum();
            int[][] grid = {
                    {1, 3, 1},
                    {1, 5, 1},
                    {4, 2, 1}
            };

            System.out.println("Result " + c.minPathSum(grid));
        }
    }

    public int minPathSum(int[][] grid) {
        int left, top;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) continue;
                left = j > 0 ? grid[i][j - 1] : Integer.MAX_VALUE;
                top = i > 0 ? grid[i - 1][j] : Integer.MAX_VALUE;

                grid[i][j] += Math.min(left, top);
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }


}
