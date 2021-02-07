package com.leetcode.example.dynamicprogramming;


import java.util.Arrays;

public class _322_CoinChange {
    public static void main(String[] args) {
        if (true) {
            _322_CoinChange s = new _322_CoinChange();
            int[] nums = {1, 2, 5};
            int amount = 11;

            System.out.println("Result " + s.coinChange(nums, amount));
        }

        if (true) {
            _322_CoinChange s = new _322_CoinChange();
            int[] nums = {2};
            int amount = 3;

            System.out.println("Result " + s.coinChange(nums, amount));
        }

        if (true) {
            _322_CoinChange s = new _322_CoinChange();
            int[] nums = {1};
            int amount = 0;

            System.out.println("Result " + s.coinChange(nums, amount));
        }
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int c : coins) {
            for (int i = c; i <= amount; i++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - c]);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

}
