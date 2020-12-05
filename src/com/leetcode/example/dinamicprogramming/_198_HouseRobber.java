package com.leetcode.example.dinamicprogramming;


public class _198_HouseRobber {
    public static void main(String[] args) {
        if (true) {
            _198_HouseRobber s = new _198_HouseRobber();
            int[] nums = {1, 2, 3, 1};

            System.out.println("Result " + s.rob(nums));
        }

        if (true) {
            _198_HouseRobber s = new _198_HouseRobber();
            int[] nums = {2, 7, 9, 3, 1};

            System.out.println("Result " + s.rob(nums));
        }

        if (true) {
            _198_HouseRobber s = new _198_HouseRobber();
            int[] nums = {4, 2, 3, 1, 5};

            System.out.println("Result " + s.rob(nums));
        }
    }

    public int rob(int[] nums){
        if(nums.length == 0) return 0;

        int prev = 0;
        int curr = nums[0];

        for(int i = 1; i < nums.length; i ++){
            int  tmp = curr;
            curr = Math.max(prev + nums[i], curr);
            prev = tmp;
        }

        return curr;
    }

    public int rob1(int[] nums) {
        if (nums.length == 0) return 0;

        int[] history = new int[nums.length + 1];
        history[1] = nums[0]; // we need to have element before first element

        for (int i = 1; i < nums.length; i++) {
            history[i + 1] = Math.max(history[i], history[i - 1] + nums[i]);
        }

        return history[nums.length];
    }

}
