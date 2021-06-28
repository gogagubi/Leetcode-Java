package com.leetcode.example.dynamicprogramming;

public class _746_MinCostClimbingStairs {
    public static void main(String[] args) {
        if (true) {
            _746_MinCostClimbingStairs s = new _746_MinCostClimbingStairs();
            int[] cost = {10, 15, 20};

            System.out.println("Result " + s.minCostClimbingStairs(cost));
        }

        if (true) {
            _746_MinCostClimbingStairs s = new _746_MinCostClimbingStairs();
            int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

            System.out.println("Result " + s.minCostClimbingStairs(cost));
        }
    }

    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }

        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }

}
