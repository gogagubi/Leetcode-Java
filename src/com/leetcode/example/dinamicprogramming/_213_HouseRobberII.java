package com.leetcode.example.dinamicprogramming;


public class _213_HouseRobberII {
    public static void main(String[] args) {
        if (false) {
            _213_HouseRobberII s = new _213_HouseRobberII();
            int[] nums = {3, 3, 2};

            System.out.println("Result " + s.rob(nums));
        }

        if (false) {
            _213_HouseRobberII s = new _213_HouseRobberII();
            int[] nums = {4, 2, 3, 1, 5};

            System.out.println("Result " + s.rob(nums));
        }

        if (false) {
            _213_HouseRobberII s = new _213_HouseRobberII();
            int[] nums = {4, 2, 3};

            System.out.println("Result " + s.rob(nums));
        }

        if (true) {
            _213_HouseRobberII s = new _213_HouseRobberII();
            int[] nums = {1, 2, 3, 1};

            System.out.println("Result " + s.rob(nums));
        }
    }

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int left = calculate(nums, 0, nums.length - 2);
        int right = calculate(nums, 1, nums.length - 1);

        return Math.max(left, right);
    }

    public int calculate(int[] nums, int startIndex, int endIndex) {
        int[] history = new int[(endIndex - startIndex + 1) + 1];
        history[1] = nums[startIndex];

        for (int i = startIndex + 1; i <= endIndex; i++) {
            history[i - startIndex + 1] = Math.max(history[i - startIndex], history[i - startIndex - 1] + nums[i]);
        }

        return history[history.length - 1];
    }

}
