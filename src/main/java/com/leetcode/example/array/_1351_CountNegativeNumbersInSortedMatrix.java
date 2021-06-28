package com.leetcode.example.array;


public class _1351_CountNegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        if (true) {
            _1351_CountNegativeNumbersInSortedMatrix c = new _1351_CountNegativeNumbersInSortedMatrix();

            int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
            System.out.println("Min elements = " + c.countNegatives(grid));
        }

    }

    public int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }

        return count;
    }

}
