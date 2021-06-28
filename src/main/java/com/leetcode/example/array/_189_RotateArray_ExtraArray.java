package com.leetcode.example.array;


import com.leetcode.statics.util.Util;

public class _189_RotateArray_ExtraArray {
    public static void main(String[] args) {
        if (true) {
            _189_RotateArray_ExtraArray c = new _189_RotateArray_ExtraArray();

            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;
            c.rotate(nums, k);
            System.out.println(Util.getPrintedArr(nums));
        }

        if (true) {
            _189_RotateArray_ExtraArray c = new _189_RotateArray_ExtraArray();

            int[] nums = {-1, -100, 3, 99};
            int k = 2;
            c.rotate(nums, k);
            System.out.println(Util.getPrintedArr(nums));
        }
    }

    private void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] reversed = new int[n];

        for (int i = 0; i < n; i++) reversed[(i + k) % n] = nums[i];
        for (int i = 0; i < n; i++) nums[i] = reversed[i];
    }
}
