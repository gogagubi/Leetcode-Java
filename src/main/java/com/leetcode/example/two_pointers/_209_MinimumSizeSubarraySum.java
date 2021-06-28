package com.leetcode.example.two_pointers;

public class _209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        if (true) {
            _209_MinimumSizeSubarraySum c = new _209_MinimumSizeSubarraySum();

            int target = 7;
            int[] nums = {2, 3, 1, 2, 4, 3};
            System.out.println(c.minSubArrayLen(target, nums));
        }

        if (true) {
            _209_MinimumSizeSubarraySum c = new _209_MinimumSizeSubarraySum();

            int target = 4;
            int[] nums = {1, 4, 4};
            System.out.println(c.minSubArrayLen(target, nums));
        }

        if (true) {
            _209_MinimumSizeSubarraySum c = new _209_MinimumSizeSubarraySum();

            int target = 11;
            int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
            System.out.println(c.minSubArrayLen(target, nums));
        }
    }


    public int minSubArrayLen(int target, int[] nums) {
        int ans = 0;
        int sum = 0;
        int i = 0, j = 0;

        while (j < nums.length) {
            sum += nums[j++];

            while (sum >= target) {
                ans = ans == 0 ? (j - i) : Math.min(j - i, ans);
                sum -= nums[i++];
            }
        }

        return ans;
    }

    //NOT WORKED YET
    /*public int bs(int i, int j, int[] nums, int target) {
        int res = 0;
        if (i > j) return res;

        if (i == j) {
            res = nums[i];
            return res;
        }

        int middle = (i + j) / 2;
        res += bs(i, middle, nums, target);
        res += bs(middle + 1, j, nums, target);

        if (res >= target) {
            ans = ans == 0 ? (j - i + 1) : Math.min(ans, j - i + 1);
        }

        return res;
    }*/

    //BRUTE FORCE APPROACH
    /*public int minSubArrayLen(int target, int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    ans = ans == 0 ? (j - i + 1) : Math.min(ans, j - i + 1);
                    break;
                }
            }
        }

        return ans;
    }*/

}
