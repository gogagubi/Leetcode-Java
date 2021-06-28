package com.leetcode.example.array;


public class _852_PeakIndexInMountainArray {
    public static void main(String[] args) {
        if (true) {
            _852_PeakIndexInMountainArray c = new _852_PeakIndexInMountainArray();

            int[] A = {0, 1, 0};
            System.out.println("Peak element index = " + c.peakIndexInMountainArray(A));
        }

        if (true) {
            _852_PeakIndexInMountainArray c = new _852_PeakIndexInMountainArray();

            int[] A = {0, 2, 1, 0};
            System.out.println("Peak element index = " + c.peakIndexInMountainArray(A));
        }

        if (true) {
            _852_PeakIndexInMountainArray c = new _852_PeakIndexInMountainArray();

            int[] A = {0, 2, 1, 0};
            System.out.println("Peak element index = " + c.peakIndexInMountainArray(A));
        }

        if (true) {
            _852_PeakIndexInMountainArray c = new _852_PeakIndexInMountainArray();

            int[] A = {1, 2, 5, 4, 1, 7, 3};
            System.out.println("Peak element index = " + c.peakIndexInMountainArray(A));
        }
    }

    public int peakIndexInMountainArray(int[] A) {
        int peak = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if ((A[i] > A[i - 1] && A[i] > A[i + 1])) {
                peak = i;
                break;
            }
        }

        return peak;
    }

    public int peakIndexInMountainArray1(int[] A) {
        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;
            if (A[middle] < A[middle + 1]) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        return right;
    }


}
