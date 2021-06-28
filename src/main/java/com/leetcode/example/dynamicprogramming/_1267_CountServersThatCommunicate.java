package com.leetcode.example.dynamicprogramming;


public class _1267_CountServersThatCommunicate {
    public static void main(String[] args) {
        if (false) {
            _1267_CountServersThatCommunicate c = new _1267_CountServersThatCommunicate();

            int[][] grid = {
                    {1, 0},
                    {0, 1}
            };
            System.out.println(c.countServers(grid));
        }

        if (false) {
            _1267_CountServersThatCommunicate c = new _1267_CountServersThatCommunicate();

            int[][] grid = {
                    {1, 0},
                    {1, 1}
            };
            System.out.println(c.countServers(grid));
        }

        if (true) {
            _1267_CountServersThatCommunicate c = new _1267_CountServersThatCommunicate();

            int[][] grid = {
                    {1, 1, 0, 0},
                    {0, 0, 1, 0},
                    {0, 0, 1, 0},
                    {0, 0, 0, 1}
            };
            System.out.println(c.countServers(grid));
        }

        if (false) {
            _1267_CountServersThatCommunicate c = new _1267_CountServersThatCommunicate();


            int[][] grid = {
                    {1, 0, 0, 1, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 1, 0}
            };
            System.out.println(c.countServers(grid));
        }
    }

    public int countServers(int[][] grid) {
        int ans = 0;

        int[] rows = new int[grid.length];
        int[] cols = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && (rows[i] > 1 || cols[j] > 1)) {
                    ans++;
                }
            }
        }

        return ans;
    }


}
