package com.leetcode.example.graphs;


import java.util.Arrays;

public class _684_RedundantConnection {
    public static void main(String[] args) {
        if (false) {
            _684_RedundantConnection s = new _684_RedundantConnection();
            int[][] edges = {{1, 2}, {1, 3}, {2, 3}};

            System.out.println("Result " + Arrays.toString(s.findRedundantConnection(edges)));
        }

        if (true) {
            _684_RedundantConnection s = new _684_RedundantConnection();
            int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};

            System.out.println("Result " + Arrays.toString(s.findRedundantConnection(edges)));
        }

        if (true) {
            _684_RedundantConnection s = new _684_RedundantConnection();
            int[][] edges = {{1, 3}, {3, 4}, {1, 5}, {3, 5}, {2, 3}}; //Expected : [3,5]

            System.out.println("Result " + Arrays.toString(s.findRedundantConnection(edges)));
        }

        if (true) {
            _684_RedundantConnection s = new _684_RedundantConnection();
            int[][] edges = {{1, 4}, {3, 4}, {1, 3}, {1, 2}, {4, 5}}; //Expected : [1,3]

            System.out.println("Result " + Arrays.toString(s.findRedundantConnection(edges)));
        }
    }

    private int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] res = new int[2];

        int[] parent = new int[n + 1];
        for (int i = 0; i < parent.length; i++) parent[i] = i;

        for (int[] edge : edges) {
            int u = find(parent, edge[0]), v = find(parent, edge[1]);

            if (u == v) {
                res = edge;
            } else {
                parent[v] = u;
            }
        }

        return res;
    }

    private int find(int[] parent, int x) {
        if (parent[x] == x) return x;
        return find(parent, parent[x]);
    }

}
