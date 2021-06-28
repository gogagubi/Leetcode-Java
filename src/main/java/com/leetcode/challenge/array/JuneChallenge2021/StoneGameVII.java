package com.leetcode.challenge.array.JuneChallenge2021;

import java.util.Arrays;

public class StoneGameVII {
    public static void main(String[] args) {
        //example 1
        if (false) {
            StoneGameVII c = new StoneGameVII();
            int[] stones = {5, 3, 1, 4, 2};
            int res = c.stoneGameVII(stones);

            System.out.println(res + " " + (res == 6));
        }

        //example 2
        if (false) {
            StoneGameVII c = new StoneGameVII();
            int[] stones = {7, 90, 5, 1, 100, 10, 10, 2};
            int res = c.stoneGameVII(stones);

            System.out.println(res + " " + (res == 122));
        }

        //example 3
        if (true) {
            StoneGameVII c = new StoneGameVII();
            int[] stones = {481, 905, 202, 250, 371, 628, 92, 604, 836, 338, 676, 734};
            int res = c.stoneGameVII(stones);

            System.out.println(res + " " + (res == 3459));
        }
    }

    public int stoneGameVII(int[] stones) {
        int[][] memo = new int[stones.length][stones.length];
        int sum = Arrays.stream(stones).sum();
        return computeScore(stones, sum, 0, stones.length - 1, memo);
    }

    private int computeScore(int[] stones, int totalSum, int left, int right, int[][] memo) {
        if (memo[left][right] > 0) {
            return memo[left][right];
        }
        if (left + 1 == right) {
            return Math.max(stones[left], stones[right]);
        }

        int myScoreAfterRemoveLeft = totalSum - stones[left];
        int opponentScoreAfterRemoveLeft = computeScore(stones, myScoreAfterRemoveLeft, left + 1, right, memo);

        int myScoreAfterRemoveRight = totalSum - stones[right];
        int opponentScoreAfterRemoveRight = computeScore(stones, myScoreAfterRemoveRight, left, right - 1, memo);

        int scoreDiff = Math.max(myScoreAfterRemoveLeft - opponentScoreAfterRemoveLeft,
                myScoreAfterRemoveRight - opponentScoreAfterRemoveRight);
        memo[left][right] = scoreDiff;
        return scoreDiff;
    }


}
