package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

//2021-06-20
public class SwimInRisingWater {

    @Test
    public void testCase1() {
        SwimInRisingWater c = new SwimInRisingWater();
        int[][] grid = {{0, 2}, {1, 3}};
        assertEquals(3, c.swimInWater(grid));
    }

    @Test
    public void testCase2() {
        SwimInRisingWater c = new SwimInRisingWater();
        int[][] grid = {{0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16}, {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}};
        assertEquals(16, c.swimInWater(grid));
    }

    class Entry {
        int i;
        int j;

        Entry(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Entry> minHeap = new PriorityQueue<>((a, b) -> grid[a.i][a.j] - grid[b.i][b.j]);
        minHeap.add(new Entry(0, 0));

        boolean[][] visited = new boolean[n][m];

        int ans = 0;

        while (!minHeap.isEmpty()) {
            Entry curr = minHeap.poll();
            if (visited[curr.i][curr.j]) continue;

            visited[curr.i][curr.j] = true;

            ans = Math.max(ans, grid[curr.i][curr.j]);

            if (curr.i == n - 1 && curr.j == m - 1) break;

            if (curr.j < m - 1) minHeap.add(new Entry(curr.i, curr.j + 1));
            if (curr.j > 0) minHeap.add(new Entry(curr.i, curr.j - 1));
            if (curr.i < n - 1) minHeap.add(new Entry(curr.i + 1, curr.j));
            if (curr.i > 0) minHeap.add(new Entry(curr.i - 1, curr.j));
        }

        return ans;
    }
}
