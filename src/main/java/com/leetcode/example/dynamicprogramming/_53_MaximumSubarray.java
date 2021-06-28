package com.leetcode.example.dynamicprogramming;


public class _53_MaximumSubarray {
    public static void main(String[] args) {
        if (true) {
            _53_MaximumSubarray s = new _53_MaximumSubarray();
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

            System.out.println("Result " + s.maxSubArray(nums));
        }
    }

    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int candidate = nums[0];

        for (int i = 1; i < nums.length; i++) {
            candidate = Math.max(nums[i], candidate + nums[i]);
            sum = Math.max(sum, candidate);
        }

        return sum;
    }

}
