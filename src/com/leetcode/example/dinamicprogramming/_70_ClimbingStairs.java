package com.leetcode.example.dinamicprogramming;

public class _70_ClimbingStairs {
    public static void main(String[] args) {
        if (true) {
            _70_ClimbingStairs s = new _70_ClimbingStairs();
            int n = 4;

            System.out.println("Result " + s.climbStairs(n));
        }
    }

    public int climbStairs(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

}
