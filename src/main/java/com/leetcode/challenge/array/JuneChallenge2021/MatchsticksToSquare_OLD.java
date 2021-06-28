package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

//2021-06-15
public class MatchsticksToSquare_OLD {

    @Test
    public void testCase1() {
        MatchsticksToSquare_OLD c = new MatchsticksToSquare_OLD();
        int[] matchsticks = {1, 1, 2, 2, 2};
        assertEquals(true, c.makesquare(matchsticks));
    }

    @Test
    public void testCase2() {
        MatchsticksToSquare_OLD c = new MatchsticksToSquare_OLD();
        int[] matchsticks = {3, 3, 3, 3, 4};
        assertEquals(false, c.makesquare(matchsticks));
    }

    @Test
    public void testCase3() {
        MatchsticksToSquare_OLD c = new MatchsticksToSquare_OLD();
        int[] matchsticks = {2, 2, 2, 2, 3, 3, 3, 3};
        assertEquals(true, c.makesquare(matchsticks));
    }

    @Test
    public void testCase4() {
        MatchsticksToSquare_OLD c = new MatchsticksToSquare_OLD();
        int[] matchsticks = {5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3};
        assertEquals(true, c.makesquare(matchsticks));
    }

    @Test
    public void testCase5() {
        MatchsticksToSquare_OLD c = new MatchsticksToSquare_OLD();
        int[] matchsticks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        assertEquals(true, c.makesquare(matchsticks));
    }

    @Test
    public void testCase6() {
        MatchsticksToSquare_OLD c = new MatchsticksToSquare_OLD();
        int[] matchsticks = {3, 1, 3, 3, 10, 7, 10, 3, 6, 9, 10, 3, 7, 6, 7};
        assertEquals(true, c.makesquare(matchsticks));
    }

    @Test
    public void testCase7() {
        MatchsticksToSquare_OLD c = new MatchsticksToSquare_OLD();
        int[] matchsticks = {2, 2, 2, 2, 2, 6};
        assertEquals(false, c.makesquare(matchsticks));
    }

    boolean[] used;
    int sides = 4;

    public boolean makesquare(int[] matchsticks) {
        used = new boolean[matchsticks.length];

        long sum = 0;
        for (int i : matchsticks) sum += ((long) i);
        if (sum % 4 != 0) return false;

        sides = 4;
        long sideSize = sum / sides;

        //Arrays.sort(matchsticks);
        return backtrack(0, matchsticks, sideSize, 0, new LinkedList<>());
    }

    private boolean backtrack(int index, int[] matchticks, long initialSideSize, long currSideSize, LinkedList<Integer> list) {
        if (currSideSize > initialSideSize) return false;

        if (currSideSize == initialSideSize) {
            sides -= 1;
            currSideSize = 0;

            while (!list.isEmpty()) {
                used[list.removeLast()] = true;
            }
        }

        if (sides == 0)
            return true;

        for (int i = index; i < matchticks.length; i++) {
            if (used[i]) continue;

            currSideSize += matchticks[i];
            list.addLast(i);
            if (backtrack(i + 1, matchticks, initialSideSize, currSideSize, list)) return true;
            if (!list.isEmpty()) list.removeLast();
            currSideSize -= matchticks[i];
        }

        return false;
    }

}
