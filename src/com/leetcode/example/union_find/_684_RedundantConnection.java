package com.leetcode.example.union_find;


import java.util.Arrays;

public class _684_RedundantConnection {
    public static void main(String[] args) {
        if (true) {
            _684_RedundantConnection s = new _684_RedundantConnection();
            int[][] edges = {{1, 2}, {1, 3}, {2, 3}};

            System.out.println("Result " + Arrays.toString(s.findRedundantConnection(edges)));
        }

        if (false) {
            _684_RedundantConnection s = new _684_RedundantConnection();
            int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};

            System.out.println("Result " + Arrays.toString(s.findRedundantConnection(edges)));
        }

        if (false) {
            _684_RedundantConnection s = new _684_RedundantConnection();
            int[][] edges = {{1, 3}, {3, 4}, {1, 5}, {3, 5}, {2, 3}}; //Expected : [3,5]

            System.out.println("Result " + Arrays.toString(s.findRedundantConnection(edges)));
        }

        if (false) {
            _684_RedundantConnection s = new _684_RedundantConnection();
            int[][] edges = {{1, 4}, {3, 4}, {1, 3}, {1, 2}, {4, 5}}; //Expected : [1,3]

            System.out.println("Result " + Arrays.toString(s.findRedundantConnection(edges)));
        }
    }

    private int[] findRedundantConnection(int[][] edges) {
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
