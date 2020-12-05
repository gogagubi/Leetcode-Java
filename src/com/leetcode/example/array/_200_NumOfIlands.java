package com.leetcode.example.array;

public class _200_NumOfIlands {

    public static void main(String[] args) {
        //example 1
        {
            _200_NumOfIlands c = new _200_NumOfIlands();
            char[][] grid = {
                    {'1', '1', '1', '1', '0'},
                    {'1', '1', '0', '1', '0'},
                    {'1', '1', '0', '0', '0'},
                    {'0', '0', '0', '0', '0'}
            };

            System.out.println("Num of island = " + c.numIslands(grid));
        }

        //example 2
        {
            _200_NumOfIlands c = new _200_NumOfIlands();
            char[][] grid = {
                    {'1', '1', '0', '0', '0'},
                    {'1', '1', '0', '0', '0'},
                    {'0', '0', '1', '0', '0'},
                    {'0', '0', '0', '1', '1'}
            };

            System.out.println("Num of island = " + c.numIslands(grid));
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numIslands += sink(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    public int sink(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }

        grid[i][j] = '0';
        sink(grid, i + 1, j);
        sink(grid, i - 1, j);
        sink(grid, i, j + 1);
        sink(grid, i, j - 1);

        return 1;
    }
}
