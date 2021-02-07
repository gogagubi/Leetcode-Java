package com.leetcode.example.dfs;


import com.leetcode.statics.util.Util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _130_SurroundedRegions {
    public static void main(String[] args) {
        _130_SurroundedRegions s = new _130_SurroundedRegions();

        //Test Sample 1
        if (true) {
            s.runTestCase("in/dfs/_130_SurroundedRegions_Sample1");
        }

        //Test Case 33
        if (true) {
            s.runTestCase("in/dfs/_130_SurroundedRegions_TestCase33");
        }

        //Test Case 38
        if (true) {
            s.runTestCase("in/dfs/_130_SurroundedRegions_TestCase38");
        }

        //Test Case 49
        if (true) {
            s.runTestCase("in/dfs/_130_SurroundedRegions_TestCase49");
        }
    }

    private void runTestCase(String fileName) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            List<List<Character>> list = new ArrayList<>();

            String line = in.readLine();
            line = line.substring(2, line.length() - 2);
            String[] arr = line.split("],\\[");
            for (String s : arr) {
                String el[] = s.split(",");

                List<Character> inList = new ArrayList<>();
                for (String e : el) inList.add(e.replace("\"", "").toCharArray()[0]);
                list.add(inList);
            }

            int n = list.size();
            int m = list.get(0).size();
            char[][] board = new char[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    board[i][j] = list.get(i).get(j);
                }
            }

            solve(board);
            Util.printArr(board);
            System.out.println();

            in.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    private void solve(char[][] board) {
        if (board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            dfs(board, i, 0);
            dfs(board, i, cols - 1);
        }

        for (int i = 0; i < cols; i++) {
            dfs(board, 0, i);
            dfs(board, rows - 1, i);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '_') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') return;
        board[i][j] = '_';

        dfs(board, i, j - 1);
        dfs(board, i - 1, j);
        dfs(board, i + 1, j);
        dfs(board, i, j + 1);

    }


}
