package com.leetcode.example.number;

import java.util.ArrayList;
import java.util.List;

public class _118_PascalsTriangle {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _118_PascalsTriangle c = new _118_PascalsTriangle();
            int numRows = 5;
            System.out.println("Pascals triangle = " + c.generate(numRows));
        }

        //example 2
        if (true) {
            _118_PascalsTriangle c = new _118_PascalsTriangle();
            int numRows = 6;
            System.out.println("Pascals triangle = " + c.generate(numRows));
        }

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        list.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = list.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(previousRow.get(j) + previousRow.get(j - 1));
            }

            row.add(1);
            list.add(row);
        }

        return list;
    }

}
