package com.leetcode.example.union_find;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        //Test Case 66
        if (true) {
            s.runTestCase("in/union_find/_547_NumberOfProvinces_TestCase66");
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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] != 1) continue;

                int u = find(arr, i);
                int v = find(arr, j);

                if (u != v) arr[v] = u;
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int i : arr) set.add(find(arr, i));
        return set.size();
    }

    private int find(int[] arr, int x) {
        if (arr[x] == x) return x;
        return find(arr, arr[x]);
    }

}
