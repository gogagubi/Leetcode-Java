package com.leetcode.example.graphs;


import java.util.*;

public class _310_MinimumHeightTrees {
    public static void main(String[] args) {
        if (true) {
            _310_MinimumHeightTrees s = new _310_MinimumHeightTrees();
            int n = 6;
            int[][] edges = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};

            System.out.println("Result " + s.findMinHeightTrees(n, edges));
        }
    }

    private List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();

        if (n <= 0) return result;

        if (n == 1) {
            result.add(0);
            return result;
        }

        int[] degree = new int[n];
        Map<Integer, List<Integer>> adj = new HashMap<>();

        for (int[] e : edges) {
            int a = e[0], b = e[1];

            degree[a]++;
            degree[b]++;

            List<Integer> list = adj.getOrDefault(a, new ArrayList<>());
            list.add(b);
            adj.put(a, list);

            list = adj.getOrDefault(b, new ArrayList<>());
            list.add(a);
            adj.put(b, list);
        }


        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                queue.add(i);
            }
        }

        while (n > 2) {
            int size = queue.size();

            for(int i = 0; i < size; i ++) {
                int source = queue.poll();
                for (int destination : adj.get(source)) {
                    if (--degree[destination] == 1) {
                        queue.add(destination);
                    }
                }
                n --;
            }
        }

        result.addAll(queue);
        return result;
    }

}
