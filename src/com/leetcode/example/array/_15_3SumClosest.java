package com.leetcode.example.array;

import java.util.Arrays;


public class _15_3SumClosest {
    public static void main(String[] args) {
        if (false) {
            _15_3SumClosest c = new _15_3SumClosest();

            int[] nums = {-1, 2, 1, -4};
            int target = 1;
            System.out.println("Closest sum " + c.threeSumClosest(nums, target));
        }

        if (false) {
            _15_3SumClosest c = new _15_3SumClosest();

            int[] nums = {0, 1, 2};
            int target = 1;
            System.out.println("Closest sum " + c.threeSumClosest(nums, target));
        }

        if (false) {
            _15_3SumClosest c = new _15_3SumClosest();

            int[] nums = {1, 1, -1, -1, 3};
            int target = -1;
            System.out.println("Closest sum " + c.threeSumClosest(nums, target));
        }

        if (true) {
            _15_3SumClosest c = new _15_3SumClosest();

            int[] nums = {1, 2, 4, 8, 16, 32, 64, 128};
            int target = 82;
            System.out.println("Closest sum " + c.threeSumClosest(nums, target));
        }
    }

    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);
        int left, right, sum;
        result = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;

            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];

                if (sum > target) {
                    right--;
                } else {
                    left++;
                }

                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }
            }
        }

        return result;
    }

}
