package com.leetcode.example.array;


import com.leetcode.statics.util.Util;

public class _283_moveZeroes {
    public static void main(String[] args) {
        if (true) {
            _283_moveZeroes c = new _283_moveZeroes();

            int[] nums = {0, 1, 0, 3, 12};
            c.moveZeroes(nums);
            System.out.println("moved " + Util.getPrintedArr(nums));
        }


        if (true) {
            _283_moveZeroes c = new _283_moveZeroes();

            int[] nums = {1, 0};
            c.moveZeroes(nums);
            System.out.println("moved " + Util.getPrintedArr(nums));
        }

        if (true) {
            _283_moveZeroes c = new _283_moveZeroes();

            int[] nums = {1, 0, 1};
            c.moveZeroes(nums);
            System.out.println("moved " + Util.getPrintedArr(nums));
        }
    }

    public void moveZeroes(int[] nums) {
        int left = 0, right;
        while (left < nums.length - 1) {
            if (nums[left] == 0) {
                right = left + 1;

                while (right < nums.length - 1 && nums[right] == 0) {
                    right++;
                }

                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
            left++;
        }
    }

}
