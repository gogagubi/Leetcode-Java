package com.leetcode.example.union_find;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _685_RedundantConnectionII {
    public static void main(String[] args) {
        _685_RedundantConnectionII s = new _685_RedundantConnectionII();

        //Test Sample 1
        if (false) {
            s.runTestCase("in/union_find/_685_RedundantConnectionII_Sample1"); //[2, 3]
        }

        //Test Sample 2
        if (false) {
            s.runTestCase("in/union_find/_685_RedundantConnectionII_Sample2"); //[4, 1]
        }

        //Test Case 16
        if (false) {
            s.runTestCase("in/union_find/_685_RedundantConnectionII_TestCase16"); //[2, 1]
        }

        //Test Case 31
        if (true) {
            s.runTestCase("in/union_find/_685_RedundantConnectionII_TestCase31"); //[3, 1]
        }

        //Test Case 38
        if (false) {
            s.runTestCase("in/union_find/_685_RedundantConnectionII_TestCase38"); //[4, 2]
        }
    }

    private void runTestCase(String fileName) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            List<List<Integer>> list = new ArrayList<>();

            String line = in.readLine();
            line = line.substring(2, line.length() - 2);
            String[] arr = line.split("],\\[");
            for (String s : arr) {
                String el[] = s.split(",");

                List<Integer> inList = new ArrayList<>();
                for (String e : el) inList.add(Integer.valueOf(e));
                list.add(inList);
            }

            int n = list.size();
            int m = list.get(0).size();
            int[][] edges = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    edges[i][j] = list.get(i).get(j);
                }
            }

            int[] res = findRedundantDirectedConnection(edges);
            System.out.println(Arrays.toString(res));

            in.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    class DisjoinSet {
        int[] parent;
        int[] ranks;

        public DisjoinSet(int n) {
            parent = new int[n];
            ranks = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                ranks[i] = 1;
            }
        }

        int find(int x) {
            if (parent[x] == x) return x;
            return find(parent[x]);
        }

        void union(int u, int v) {
            if (ranks[u] >= ranks[v]) {
                parent[v] = u;
                ranks[u] += ranks[v];
            } else {
                parent[u] = v;
                ranks[v] += ranks[u];
            }
        }
    }

    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        DisjoinSet ds = new DisjoinSet(n + 1);

        int[] ans1 = null;
        int[] ans2 = null;

        int[] map = new int[n + 1];
        for (int[] i : edges) {
            if (map[i[1]] > 0) {
                ans1 = new int[]{map[i[1]], i[1]};
                ans2 = i;
            } else {
                map[i[1]] = i[0];
            }
        }

        for (int[] i : edges) {
            if (ans2 == i) continue;

            int u = ds.find(i[0]);
            int v = ds.find(i[1]);

            if (u == v) {
                return ans1 == null ? i : ans1;
            } else {
                ds.union(u, v);
            }


        }

        return ans2;
    }

}
