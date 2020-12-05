package com.leetcode.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class _15_3Sum {
    public static void main(String[] args) {
        if (true) {
            _15_3Sum c = new _15_3Sum();

            int[] nums = {-1, 0, 1, 2, -1, -4};
            System.out.println("List " + c.threeSum(nums));
        }


        if (true) {
            _15_3Sum c = new _15_3Sum();

            int[] nums = {1, -1, -1, 0};
            System.out.println("List " + c.threeSum(nums));
        }

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if (nums.length < 3) {
            return result;
        }

        int left, right, sum;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (nums[i] != nums[i - 1])) {
                left = i + 1;
                right = nums.length - 1;

                while (left < right) {
                    sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                    }

                    if (sum > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return result;
    }

}
