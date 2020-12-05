package com.leetcode.example.array;

import com.leetcode.statics.util.Util;


public class _922_SortArrayByParity {
    public static void main(String[] args) {
        if (false) {
            _922_SortArrayByParity c = new _922_SortArrayByParity();

            int[] A = {4, 2, 5, 7};
            System.out.println("Sorted by parity " + Util.getPrintedArr(c.sortArrayByParityII(A)));
        }

        if (false) {
            _922_SortArrayByParity c = new _922_SortArrayByParity();

            int[] A = {2, 3};
            System.out.println("Sorted by parity " + Util.getPrintedArr(c.sortArrayByParityII(A)));
        }

        if (false) {
            _922_SortArrayByParity c = new _922_SortArrayByParity();

            int[] A = {4, 1, 2, 1};
            System.out.println("Sorted by parity " + Util.getPrintedArr(c.sortArrayByParityII(A)));
        }

        if (true) {
            _922_SortArrayByParity c = new _922_SortArrayByParity();

            int[] A = {4, 1, 1, 0, 1, 0};
            System.out.println("Sorted by parity " + Util.getPrintedArr(c.sortArrayByParityII(A)));
        }
    }

    public int[] sortArrayByParityII(int[] A) {
        int length = A.length;
        int left = 0, right = length - 1;

        while (right >= 0 && left < length) {
            while (left < length && A[left] % 2 == 0) {
                left += 2;
            }

            while (right >= 0 && A[right] % 2 == 1) {
                right -= 2;
            }

            if (right >= 0 && left < length) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
            }

            left += 2;
            right -= 2;
        }

        return A;
    }

}
