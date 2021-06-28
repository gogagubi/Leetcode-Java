package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

//2021-06-16
public class MatchsticksToSquare {

    @Test
    public void testCase1() {
        MatchsticksToSquare c = new MatchsticksToSquare();
        int[] matchsticks = {1, 1, 2, 2, 2};
        assertEquals(true, c.makesquare(matchsticks));
    }

    @Test
    public void testCase2() {
        MatchsticksToSquare c = new MatchsticksToSquare();
        int[] matchsticks = {3, 3, 3, 3, 4};
        assertEquals(false, c.makesquare(matchsticks));
    }

    @Test
    public void testCase3() {
        MatchsticksToSquare c = new MatchsticksToSquare();
        int[] matchsticks = {2, 2, 2, 2, 3, 3, 3, 3};
        assertEquals(true, c.makesquare(matchsticks));
    }

    @Test
    public void testCase4() {
        MatchsticksToSquare c = new MatchsticksToSquare();
        int[] matchsticks = {5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3};
        assertEquals(true, c.makesquare(matchsticks));
    }

    @Test
    public void testCase5() {
        MatchsticksToSquare c = new MatchsticksToSquare();
        int[] matchsticks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        assertEquals(true, c.makesquare(matchsticks));
    }

    @Test
    public void testCase6() {
        MatchsticksToSquare c = new MatchsticksToSquare();
        int[] matchsticks = {3, 1, 3, 3, 10, 7, 10, 3, 6, 9, 10, 3, 7, 6, 7};
        assertEquals(true, c.makesquare(matchsticks));
    }

    @Test
    public void testCase7() {
        MatchsticksToSquare c = new MatchsticksToSquare();
        int[] matchsticks = {2, 2, 2, 2, 2, 6};
        assertEquals(false, c.makesquare(matchsticks));
    }

    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int i : matchsticks) sum += ((long) i);
        if (sum % 4 != 0) return false;

        int side = sum / 4;
        int[] sides = {side, side, side, side};

        return backtrack(matchsticks, 0, sides);
    }

    private boolean backtrack(int[] matchsticks, int i, int[] sides) {
        if (i == matchsticks.length) {
            return sides[0] == 0 && sides[1] == 0 && sides[2] == 0 && sides[3] == 0;
        }

        for (int j = 0; j < sides.length; j++) {
            if (matchsticks[i] > sides[j]) continue;
            sides[j] -= matchsticks[i];
            if(backtrack(matchsticks, i + 1, sides)) return true;
            sides[j] += matchsticks[i];
        }

        return false;
    }

}
