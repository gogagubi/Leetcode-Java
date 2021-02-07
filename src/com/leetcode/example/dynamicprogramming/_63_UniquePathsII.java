package com.leetcode.example.dynamicprogramming;


public class _63_UniquePathsII {
    public static void main(String[] args) {
        if (true) {
            _63_UniquePathsII c = new _63_UniquePathsII();
            int[][] obstacleGrid = {
                    {0, 0, 0},
                    {0, 1, 0},
                    {0, 0, 0}
            };

            System.out.println("Result " + c.uniquePathsWithObstacles(obstacleGrid));
        }

        if (false) {
            _63_UniquePathsII c = new _63_UniquePathsII();
            int[][] obstacleGrid = {
                    {1}
            };

            System.out.println("Result " + c.uniquePathsWithObstacles(obstacleGrid));
        }

        if (false) {
            _63_UniquePathsII c = new _63_UniquePathsII();
            int[][] obstacleGrid = {
                    {}
            };

            System.out.println("Result " + c.uniquePathsWithObstacles(obstacleGrid));
        }

        if (false) {
            _63_UniquePathsII c = new _63_UniquePathsII();
            int[][] obstacleGrid = {
                    {0, 1}
            };

            System.out.println("Result " + c.uniquePathsWithObstacles(obstacleGrid));
        }
    }

    public int uniquePathsWithObstacles1(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0) return 0;
        if (obstacleGrid[0].length == 0) return 1;

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        boolean[][] obstacles = new boolean[m][n];

        int left, top;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    if (obstacleGrid[i][j] == 1) return 0; // there is no way to go
                    obstacleGrid[i][j] = 1;
                } else if (obstacleGrid[i][j] == 1) {
                    obstacles[i][j] = true;
                } else {
                    left = (j != 0 && !obstacles[i][j - 1]) ? obstacleGrid[i][j - 1] : 0;
                    top = (i != 0 && !obstacles[i - 1][j]) ? obstacleGrid[i - 1][j] : 0;

                    obstacleGrid[i][j] = left + top;
                }
            }
        }

        return !obstacles[m - 1][n - 1] ? obstacleGrid[m - 1][n - 1] : 0;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] dp = new int[width];
        dp[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int j = 0; j < width; j++) {
                if (row[j] == 1)
                    dp[j] = 0;
                else if (j > 0)
                    dp[j] += dp[j - 1];
            }
        }
        return dp[width - 1];
    }

}
