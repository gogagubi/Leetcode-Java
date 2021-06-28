package com.leetcode.example.graphs;


import java.util.*;

public class _399_EvaluateDivision {
    public static void main(String[] args) {
        if (true) {
            _399_EvaluateDivision s = new _399_EvaluateDivision();
            List<List<String>> equations = Arrays.asList(
                    Arrays.asList("a", "b"),
                    Arrays.asList("b", "c")
            );

            double[] values = {2.0, 3.0};

            List<List<String>> queries = Arrays.asList(
                    Arrays.asList("a", "c"),
                    Arrays.asList("b", "a"),
                    Arrays.asList("a", "e"),
                    Arrays.asList("a", "a"),
                    Arrays.asList("x", "x")
            );

            System.out.println("Result " + Arrays.toString(s.calcEquation(equations, values, queries)));
        }

    }

    class Pair {
        String key;
        double value;

        public Pair(String key, double value) {
            this.key = key;
            this.value = value;
        }

    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Pair>> map = this.buildMap(equations, values);
        double[] res = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            res[i] = dfs(map, queries.get(i).get(0), queries.get(i).get(1), new HashSet<>());
        }

        return res;
    }

    public double dfs(Map<String, List<Pair>> map, String src, String dest, Set<String> visited) {
        if (!map.containsKey(src) || !map.containsKey(dest)) return -1.0;
        if (visited.contains(src)) return -1.0;
        if (src.equals(dest)) return 1.0;

        visited.add(src);
        for (Pair p : map.get(src)) {
            double ans = dfs(map, p.key, dest, visited);
            if (ans != -1.0) return ans * p.value;
        }

        return -1.0;
    }

    public Map<String, List<Pair>> buildMap(List<List<String>> equations, double[] values) {
        int n = equations.size();
        Map<String, List<Pair>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String src = equations.get(i).get(0);
            String dest = equations.get(i).get(1);

            List<Pair> sourceList = map.getOrDefault(src, new ArrayList());
            sourceList.add(new Pair(dest, values[i]));
            map.put(src, sourceList);

            List<Pair> destinationList = map.getOrDefault(dest, new ArrayList());
            destinationList.add(new Pair(src, 1 / values[i]));
            map.put(dest, destinationList);
        }

        return map;
    }
}
