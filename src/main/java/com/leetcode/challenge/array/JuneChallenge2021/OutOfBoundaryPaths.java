package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//2021-06-24
public class OutOfBoundaryPaths {

    @Test
    public void testCase1() {
        OutOfBoundaryPaths c = new OutOfBoundaryPaths();
        int m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0;

        assertEquals(6, c.findPaths(m, n, maxMove, startRow, startColumn));
    }

    @Test
    public void testCase2() {
        OutOfBoundaryPaths c = new OutOfBoundaryPaths();
        int m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1;

        assertEquals(12, c.findPaths(m, n, maxMove, startRow, startColumn));
    }

    @Test
    public void testCase3() {
        OutOfBoundaryPaths c = new OutOfBoundaryPaths();
        int m = 8, n = 50, maxMove = 23, startRow = 5, startColumn = 26;

        assertEquals(914783380, c.findPaths(m, n, maxMove, startRow, startColumn));
    }

    @Test
    public void testCase4() {
        OutOfBoundaryPaths c = new OutOfBoundaryPaths();
        int m = 36, n = 5, maxMove = 50, startRow = 15, startColumn = 3;

        assertEquals(390153306, c.findPaths(m, n, maxMove, startRow, startColumn));
    }

    Long[][][] memo;
    int MOD = 1000000000 + 7;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        memo = new Long[m][n][maxMove + 1];

        return (int) dfs(m, n, maxMove, startRow, startColumn);
    }

    public long dfs(int m, int n, int maxMove, int row, int col) {
        if (row < 0 || row == m || col < 0 || col == n) return 1;
        if (maxMove == 0) return 0;

        if (memo[row][col][maxMove] != null) return memo[row][col][maxMove];

        long total = 0;
        total = (total + dfs(m, n, maxMove - 1, row - 1, col)) % MOD;
        total = (total + dfs(m, n, maxMove - 1, row, col + 1)) % MOD;
        total = (total + dfs(m, n, maxMove - 1, row + 1, col)) % MOD;
        total = (total + dfs(m, n, maxMove - 1, row, col - 1)) % MOD;

        memo[row][col][maxMove] = total;
        return total;
    }

}
