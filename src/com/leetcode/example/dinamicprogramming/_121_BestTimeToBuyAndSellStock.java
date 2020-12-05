package com.leetcode.example.dinamicprogramming;


public class _121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        if (true) {
            _121_BestTimeToBuyAndSellStock s = new _121_BestTimeToBuyAndSellStock();
            int[] nums = {7, 1, 5, 3, 6, 4};

            System.out.println("Result " + s.maxProfit(nums));
        }
    }

    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;

        int price = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            price = Math.min(price, prices[i]);
            profit = Math.max(profit, prices[i] - price);
        }

        return profit;
    }

}
