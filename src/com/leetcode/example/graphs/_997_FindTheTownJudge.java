package com.leetcode.example.graphs;


public class _997_FindTheTownJudge {
    public static void main(String[] args) {
        if (true) {
            _997_FindTheTownJudge s = new _997_FindTheTownJudge();
            int N = 2;
            int[][] trust = {{1, 2}};

            System.out.println("Result " + s.findJudge(N, trust));
        }

        if (true) {
            _997_FindTheTownJudge s = new _997_FindTheTownJudge();
            int N = 3;
            int[][] trust = {{1, 3}, {2, 3}};

            System.out.println("Result " + s.findJudge(N, trust));
        }

        if (true) {
            _997_FindTheTownJudge s = new _997_FindTheTownJudge();
            int N = 3;
            int[][] trust = {{1, 3}, {2, 3}, {3, 1}};

            System.out.println("Result " + s.findJudge(N, trust));
        }

        if (true) {
            _997_FindTheTownJudge s = new _997_FindTheTownJudge();
            int N = 1;
            int[][] trust = {};

            System.out.println("Result " + s.findJudge(N, trust));
        }
    }

    private int findJudge(int N, int[][] trust) {
        int[] count = new int[N + 1];
        int a, b;

        for (int i = 0; i < trust.length; i++) {
            a = trust[i][0];
            b = trust[i][1];

            count[a]--;
            count[b]++;
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] == N - 1) return i;
        }

        return -1;
    }

}
