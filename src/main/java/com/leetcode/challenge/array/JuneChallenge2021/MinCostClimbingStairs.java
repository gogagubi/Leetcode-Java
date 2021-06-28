package com.leetcode.challenge.array.JuneChallenge2021;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        //example 1
        if (true) {
            MinCostClimbingStairs c = new MinCostClimbingStairs();
            int[] costs = {10, 15, 20};
            int res = c.minCostClimbingStairs(costs);
            System.out.println(res + " " + (res == 15));
        }

        //example 2
        if (true) {
            MinCostClimbingStairs c = new MinCostClimbingStairs();
            int[] costs = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
            int res = c.minCostClimbingStairs(costs);
            System.out.println(res + " " + (res == 6));
        }
    }

    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }

        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }

}
