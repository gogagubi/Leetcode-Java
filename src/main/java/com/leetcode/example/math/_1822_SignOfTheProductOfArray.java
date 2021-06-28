package com.leetcode.example.math;

public class _1822_SignOfTheProductOfArray {
    public static void main(String[] args) {
        if (true) {
            _1822_SignOfTheProductOfArray s = new _1822_SignOfTheProductOfArray();
            int[] nums = {-1, -2, -3, -4, 3, 2, 1};

            System.out.println(s.arraySign(nums));
        }

        if (true) {
            _1822_SignOfTheProductOfArray s = new _1822_SignOfTheProductOfArray();
            int[] nums = {1, 5, 0, 2, -3};

            System.out.println(s.arraySign(nums));
        }

        if (true) {
            _1822_SignOfTheProductOfArray s = new _1822_SignOfTheProductOfArray();
            int[] nums = {-1, 1, -1, 1, -1};

            System.out.println(s.arraySign(nums));
        }
    }

    public int arraySign(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) nums[i] = -1;
            else if (nums[i] > 0) nums[i] = 1;
            else return 0;
        }

        int ans = 1;
        for (int i : nums) ans *= i;

        return ans;
    }
}
