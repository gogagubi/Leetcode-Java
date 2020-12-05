package com.leetcode.example.array;


import com.leetcode.statics.util.Util;

import java.util.Arrays;

public class _977_SquaresOfSortedArray {
    public static void main(String[] args) {
        if (false) {
            _977_SquaresOfSortedArray c = new _977_SquaresOfSortedArray();

            int[] A = {-4, -1, 0, 3, 10};
            System.out.println("Squares sorted = " + Util.getPrintedArr(c.sortedSquares(A)));
        }

        if (true) {
            _977_SquaresOfSortedArray c = new _977_SquaresOfSortedArray();

            int[] A = {-5, -4, -3, -1};
            System.out.println("Squares sorted = " + Util.getPrintedArr(c.sortedSquares(A)));
        }
    }

    public int[] sortedSquares(int[] A) {
        int length = A.length;

        int positive = 0;
        while (positive < length && A[positive] < 0) {
            positive++;
        }
        int negative = positive - 1;

        int[] res = new int[length];
        int counter = 0;

        while (negative >= 0 && positive < length) {
            if (A[negative] * A[negative] > A[positive] * A[positive]) {
                res[counter++] = A[positive] * A[positive];
                positive++;

            } else {
                res[counter++] = A[negative] * A[negative];
                negative--;
            }
        }

        while (negative >= 0) {
            res[counter++] = A[negative] * A[negative];
            negative--;
        }

        while (positive < length) {
            res[counter++] = A[positive] * A[positive];
            positive++;
        }

        return res;
    }

    public int[] sortedSquares1(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }

        Arrays.sort(A);
        return A;
    }

}
