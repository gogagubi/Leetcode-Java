package com.leetcode.example.array;

import java.util.Arrays;
import java.util.HashSet;

public class _217_ContainsDuplicate {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _217_ContainsDuplicate c = new _217_ContainsDuplicate();
            int[] nums = {1, 2, 3, 1};
            System.out.println("Contains duplicate = " + c.containsDuplicate(nums));
        }

        //example 2
        if (true) {
            _217_ContainsDuplicate c = new _217_ContainsDuplicate();
            int[] nums = {1, 2, 3, 4};
            System.out.println("Contains duplicate = " + c.containsDuplicate(nums));
        }

    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }


    public boolean containsDuplicateV1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public boolean containsDuplicateV2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

}
