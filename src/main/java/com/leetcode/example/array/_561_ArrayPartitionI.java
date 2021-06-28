package com.leetcode.example.array;

import java.util.Arrays;

public class _561_ArrayPartitionI {
    public static void main(String[] args) {
        if (false) {
            _561_ArrayPartitionI c = new _561_ArrayPartitionI();

            int[] nums = {1, 4, 3, 2};
            System.out.println("Sum of min in pairs " + c.arrayPairSum(nums));
        }

        if (true) {
            _561_ArrayPartitionI c = new _561_ArrayPartitionI();

            int[] nums = {1, 1, 2, 2};
            System.out.println("Sum of min in pairs " + c.arrayPairSum(nums));
        }
    }

    public int arrayPairSum(int[] nums) {
        int sum = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

}
