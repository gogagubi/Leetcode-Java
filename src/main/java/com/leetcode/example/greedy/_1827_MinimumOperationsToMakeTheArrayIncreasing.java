package com.leetcode.example.greedy;

import java.util.ArrayList;
import java.util.List;

public class _1827_MinimumOperationsToMakeTheArrayIncreasing {
    public static void main(String[] args) {
        if (true) {
            _1827_MinimumOperationsToMakeTheArrayIncreasing c = new _1827_MinimumOperationsToMakeTheArrayIncreasing();

            int[] nums = {1, 1, 1};
            System.out.println(c.minOperations(nums));
        }

        if (true) {
            _1827_MinimumOperationsToMakeTheArrayIncreasing c = new _1827_MinimumOperationsToMakeTheArrayIncreasing();

            int[] nums = {1, 5, 2, 4, 1};
            System.out.println(c.minOperations(nums));
        }

        if (true) {
            _1827_MinimumOperationsToMakeTheArrayIncreasing c = new _1827_MinimumOperationsToMakeTheArrayIncreasing();

            int[] nums = {8};
            System.out.println(c.minOperations(nums));
        }
    }

    public int minOperations(int[] nums) {
        int ans = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                int increased = nums[i - 1] - nums[i] + 1;
                nums[i] += increased;
                ans += increased;
            }
        }

        return ans;
    }

}
