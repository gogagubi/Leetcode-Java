package com.leetcode.challenge.array.JuneChallenge2021;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

//2021-06-25
public class RedundantConnection {

    @Test
    public void testCase1() {
        RedundantConnection s = new RedundantConnection();
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};

        Assert.assertArrayEquals(new int[]{2, 3}, s.findRedundantConnection(edges));
    }

    @Test
    public void testCase2() {
        RedundantConnection s = new RedundantConnection();
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};

        Assert.assertArrayEquals(new int[]{1, 4}, s.findRedundantConnection(edges));
    }

    @Test
    public void testCase3() {
        RedundantConnection s = new RedundantConnection();
        int[][] edges = {{1, 3}, {3, 4}, {1, 5}, {3, 5}, {2, 3}};

        Assert.assertArrayEquals(new int[]{3, 5}, s.findRedundantConnection(edges));
    }

    @Test
    public void testCase4() {
        RedundantConnection s = new RedundantConnection();
        int[][] edges = {{1, 4}, {3, 4}, {1, 3}, {1, 2}, {4, 5}};

        Assert.assertArrayEquals(new int[]{1, 3}, s.findRedundantConnection(edges));
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] res = new int[2];

        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) arr[i] = i;

        for (int[] edge : edges) {
            int u = find(arr, edge[0]), v = find(arr, edge[1]);

            if (u == v) {
                res = edge;
            } else {
                arr[v] = u;
            }
        }

        return res;
    }

    private int find(int[] parent, int x) {
        if (parent[x] == x) return x;
        return find(parent, parent[x]);
    }

}
