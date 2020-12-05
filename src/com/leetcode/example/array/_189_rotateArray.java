package com.leetcode.example.array;


import com.leetcode.statics.util.Util;

public class _189_rotateArray {
    public static void main(String[] args) {
        if (true) {
            _189_rotateArray c = new _189_rotateArray();

            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;
            c.rotate(nums, k);
            System.out.println(Util.getPrintedArr(nums));
        }

        if (true) {
            _189_rotateArray c = new _189_rotateArray();

            int[] nums = {-1, -100, 3, 99};
            int k = 2;
            c.rotate(nums, k);
            System.out.println(Util.getPrintedArr(nums));
        }
    }

    public void rotate(int[] nums, int k) {
        int last, length = nums.length;

        if (length == 0 || length == 1 || length == k) {
            return;
        }

        if (k > length) {
            k = k - (k / length * length);
        }

        while (k > 0) {
            last = nums[length - 1];
            for (int i = length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = last;

            k--;
        }
    }

}
