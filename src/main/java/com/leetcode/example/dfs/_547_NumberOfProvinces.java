package com.leetcode.example.dfs;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _547_NumberOfProvinces {
    public static void main(String[] args) {
        _547_NumberOfProvinces s = new _547_NumberOfProvinces();

        //Test Sample 1
        if (true) {
            s.runTestCase("in/union_find/_547_NumberOfProvinces_Sample1");
        }

        //Test Sample 2
        if (true) {
            s.runTestCase("in/union_find/_547_NumberOfProvinces_Sample2");
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
            int[][] isConnected = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    isConnected[i][j] = list.get(i).get(j);
                }
            }

            int res = findCircleNum(isConnected);
            System.out.println(res);

            in.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    private int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n + 1];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (dfs(i, isConnected, visited) > 0) ans++;
        }

        return ans;
    }

    private int dfs(int index, int[][] isConnected, boolean[] visited) {
        int count = 0;
        if (visited[index]) return count;
        visited[index] = true;

        for (int i = 0; i < isConnected[index].length; i++) {
            if (isConnected[index][i] == 0) continue;
            count += dfs(i, isConnected, visited);
        }

        return count + 1;
    }

}
