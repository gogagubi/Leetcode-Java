package com.leetcode.example.array;


import com.leetcode.statics.util.Util;

public class _1337_KWeakestRowInMatrix {
    public static void main(String[] args) {
        if (true) {
            _1337_KWeakestRowInMatrix c = new _1337_KWeakestRowInMatrix();

            int[][] mat = {
                    {1, 1, 0, 0, 0},
                    {1, 1, 1, 1, 0},
                    {1, 0, 0, 0, 0},
                    {1, 1, 0, 0, 0},
                    {1, 1, 1, 1, 1}
            };
            int k = 3;
            System.out.println("Weakest Rows " + Util.getPrintedArr(c.kWeakestRows(mat, k)));
        }

        if (true) {
            _1337_KWeakestRowInMatrix c = new _1337_KWeakestRowInMatrix();

            int[][] mat = {
                    {1, 0, 0, 0},
                    {1, 1, 1, 1},
                    {1, 0, 0, 0},
                    {1, 0, 0, 0}
            };
            int k = 2;
            System.out.println("Weakest Rows " + Util.getPrintedArr(c.kWeakestRows(mat, k)));
        }
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];

        //gather soldiers count into single dimensional array(per row)
        int[] counts = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    counts[i]++;
                }
            }
        }

        int indexer = 0;
        while (k > 0) {
            //make linear search k times and take minimum index to fill in result array
            int minIndex = 0;
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] < counts[minIndex]) {
                    minIndex = i;
                }
            }

            result[indexer++] = minIndex;
            counts[minIndex] = Integer.MAX_VALUE;
            k--;
        }

        return result;
    }

}
