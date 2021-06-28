package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

//2021-06-21
public class PascalsTriangle {

    @Test
    public void testCase1() {
        PascalsTriangle c = new PascalsTriangle();
        int numRows = 5;
        assertEquals(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1)
        ), c.generate(numRows));
    }

    @Test
    public void testCase2() {
        PascalsTriangle c = new PascalsTriangle();
        int numRows = 1;
        assertEquals(Arrays.asList(
                Arrays.asList(1)
        ), c.generate(numRows));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) row.add(1);
                else row.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
            }

            ans.add(row);
        }


        return ans;
    }
}
