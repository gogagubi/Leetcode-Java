package com.leetcode.example.array;


import com.leetcode.statics.util.Util;

public class _189_RotateArray_UsingReverse {
    public static void main(String[] args) {
        if (true) {
            _189_RotateArray_UsingReverse c = new _189_RotateArray_UsingReverse();

            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;
            c.rotate(nums, k);
            System.out.println(Util.getPrintedArr(nums));
        }

        if (true) {
            _189_RotateArray_UsingReverse c = new _189_RotateArray_UsingReverse();

            int[] nums = {-1, -100, 3, 99};
            int k = 2;
            c.rotate(nums, k);
            System.out.println(Util.getPrintedArr(nums));
        }
    }

    private void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
    }
}
