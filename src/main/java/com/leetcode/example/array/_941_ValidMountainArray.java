package com.leetcode.example.array;


public class _941_ValidMountainArray {
    public static void main(String[] args) {
        if (false) {
            _941_ValidMountainArray c = new _941_ValidMountainArray();

            int[] A = {2, 1};
            System.out.println("Is valid = " + c.validMountainArray(A));
        }

        if (false) {
            _941_ValidMountainArray c = new _941_ValidMountainArray();

            int[] A = {3, 5, 5};
            System.out.println("Is valid = " + c.validMountainArray(A));
        }

        if (true) {
            _941_ValidMountainArray c = new _941_ValidMountainArray();

            int[] A = {0, 3, 2, 1};
            System.out.println("Is valid = " + c.validMountainArray(A));
        }
    }


    public boolean validMountainArray(int[] A) {
        int i = 0;
        while ((i + 1) < A.length && A[i] < A[i + 1]) {
            i++;
        }

        if (i == 0 || i + 1 >= A.length) {
            return false;
        }

        while (i + 1 < A.length) {
            if (A[i] <= A[i + 1]) {
                return false;
            }

            i++;
        }

        return true;
    }


}
