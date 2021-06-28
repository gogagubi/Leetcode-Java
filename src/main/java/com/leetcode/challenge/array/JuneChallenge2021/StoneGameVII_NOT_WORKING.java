package com.leetcode.challenge.array.JuneChallenge2021;

public class StoneGameVII_NOT_WORKING {
    public static void main(String[] args) {
        //example 1
        if (false) {
            StoneGameVII_NOT_WORKING c = new StoneGameVII_NOT_WORKING();
            int[] stones = {5, 3, 1, 4, 2};
            int res = c.stoneGameVII(stones);

            System.out.println(res + " " + (res == 6));
        }

        //example 2
        if (false) {
            StoneGameVII_NOT_WORKING c = new StoneGameVII_NOT_WORKING();
            int[] stones = {7, 90, 5, 1, 100, 10, 10, 2};
            int res = c.stoneGameVII(stones);

            System.out.println(res + " " + (res == 122));
        }

        //example 3
        if (true) {
            StoneGameVII_NOT_WORKING c = new StoneGameVII_NOT_WORKING();
            int[] stones = {481, 905, 202, 250, 371, 628, 92, 604, 836, 338, 676, 734};
            int res = c.stoneGameVII(stones);

            System.out.println(res + " " + (res == 3459));
        }
    }

    //NOT WORKING
    int ans = 0;
    int[][] memo;

    public int stoneGameVII(int[] stones) {
        int n = stones.length;
        int total = 0;
        for (int i : stones) total += i;
        memo = new int[n][n];

        calculate(stones, 0, stones.length - 1, total, 0, 0);
        return ans;
    }

    private void calculate(int[] stones, int l, int r, int total, int aliceScore, int bobScore) {
        if (l >= r) {
            ans = (ans == 0) ? aliceScore - bobScore : Math.min(ans, aliceScore - bobScore);

            memo[l][r] = ans;
            return;
        }
        if (memo[l][r] > 0) return;

        if (total - stones[l] > total - stones[r]) {
            total -= stones[l];
            aliceScore += total;
            l++;
        } else {
            total -= stones[r];
            aliceScore += total;
            r--;
        }

        int bobscore1 = bobScore + (total - stones[l]);
        int bobscore2 = bobScore + (total - stones[r]);

        calculate(stones, l + 1, r, total - stones[l], aliceScore, bobscore1);
        calculate(stones, l, r - 1, total - stones[r], aliceScore, bobscore2);
    }


}
