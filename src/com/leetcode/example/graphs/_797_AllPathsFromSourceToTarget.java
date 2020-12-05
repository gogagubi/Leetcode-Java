package com.leetcode.example.graphs;


import java.util.*;

public class _797_AllPathsFromSourceToTarget {
    public static void main(String[] args) {
        if (true) {
            _797_AllPathsFromSourceToTarget s = new _797_AllPathsFromSourceToTarget();
            int[][] graph = {{1, 2}, {3}, {3}, {}};

            System.out.println("Result " + s.allPathsSourceTarget(graph)); //Expected: [[0,1,3],[0,2,3]]
        }

        if (true) {
            _797_AllPathsFromSourceToTarget s = new _797_AllPathsFromSourceToTarget();
            int[][] graph = {{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}};

            System.out.println("Result " + s.allPathsSourceTarget(graph)); //Expected: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
        }

        if (true) {
            _797_AllPathsFromSourceToTarget s = new _797_AllPathsFromSourceToTarget();
            int[][] graph = {{4, 3, 1}, {3, 2, 4}, {}, {4}, {}};

            System.out.println("Result " + s.allPathsSourceTarget(graph)); //Expected: [[0,4],[0,3,4],[0,1,3,4],[0,1,4]]
        }
    }

    private List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();

        LinkedList<Integer> currList = new LinkedList<>();
        currList.add(0);
        dfs(0, graph, currList, result);

        return result;
    }

    private void dfs(int index, int[][] graph, LinkedList<Integer> currList, List<List<Integer>> result) {
        if (index == graph.length - 1) {
            result.add(new ArrayList<>(currList));
            return;
        }

        for (int i : graph[index]) {
            currList.add(i);
            dfs(i, graph, currList, result);
            currList.removeLast();
        }
    }

}
