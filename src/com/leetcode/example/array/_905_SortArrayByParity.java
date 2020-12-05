package com.leetcode.example.array;


import com.leetcode.statics.util.Util;

public class _905_SortArrayByParity {
    public static void main(String[] args) {
        if (false) {
            _905_SortArrayByParity c = new _905_SortArrayByParity();

            int[] A = {3, 1, 2, 4};
            System.out.println("Sorted array " + Util.getPrintedArr(c.sortArrayByParity(A)));
        }

        if (false) {
            _905_SortArrayByParity c = new _905_SortArrayByParity();

            int[] A = {2, 6, 4, 3, 5, 1};
            System.out.println("Sorted array " + Util.getPrintedArr(c.sortArrayByParity(A)));
        }

        if (true) {
            _905_SortArrayByParity c = new _905_SortArrayByParity();

            int[] A = {0,2};
            System.out.println("Sorted array " + Util.getPrintedArr(c.sortArrayByParity(A)));
        }
    }

    public int[] sortArrayByParity(int[] A) {
        if(A == null || A.length == 0 || A.length == 1){
            return A;
        }

        int left = 0, right = A.length - 1;
        while (left < right) {
            while (left < right && (A[left] & 1) == 0) {
                left++;
            }

            if ((A[right] & 1) == 0) {
                int tmp = A[right];
                A[right] = A[left];
                A[left] = tmp;
                left++;
            }

            right--;
        }

        return A;
    }


}
