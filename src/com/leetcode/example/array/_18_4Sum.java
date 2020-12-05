package com.leetcode.example.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18_4Sum {
    public static void main(String[] args) {
        if (false) {
            _18_4Sum c = new _18_4Sum();

            int[] nums = {1, 0, -1, 0, -2, 2};
            int target = 0;
            System.out.println("Converted " + c.fourSum(nums, target));
        }

        if (true) {
            _18_4Sum c = new _18_4Sum();

            int[] nums = {-1, 2, 2, -5, 0, -1, 4};
            int target = 3;
            System.out.println("Converted " + c.fourSum(nums, target));
        }

        if (false) {
            _18_4Sum c = new _18_4Sum();

            int[] nums = {0, 0, 0, 0};
            int target = 0;
            System.out.println("Converted " + c.fourSum(nums, target));
        }

        if (true) {
            _18_4Sum c = new _18_4Sum();

            int[] nums = {-3, -2, -1, 0, 0, 1, 2, 3};
            int target = 0;
            System.out.println("Converted " + c.fourSum(nums, target));
        }

    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4) {
            return result;
        }

        int left, right, sum;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        left = j + 1;
                        right = nums.length - 1;

                        while (left < right) {
                            sum = nums[i] + nums[j] + nums[left] + nums[right];
                            if (sum == target) {
                                result.add(Arrays.asList(nums[i],
                                        nums[j],
                                        nums[left],
                                        nums[right]));


                                while (left < right && left < nums.length - 1 && nums[left] == nums[left + 1]) left++;
                                while (left < right && nums[right] == nums[right - 1]) right--;
                            }

                            if (sum > target) right--;
                            else left++;
                        }
                    }
                }
            }
        }

        return result;
    }

}
