package com.leetcode.example.array;

import java.util.Arrays;

public class _167_TwoSumII {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _167_TwoSumII c = new _167_TwoSumII();
            int[] numbers = {2, 7, 11, 15};
            int target = 9;
            System.out.println("Two numbers = " + Arrays.toString(c.twoSum(numbers, target)));
        }

    }

    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (leftPointer < rightPointer) {
            int sum = numbers[leftPointer] + numbers[rightPointer];

            if (sum > target) {
                rightPointer--;
            } else if (sum < target) {
                leftPointer++;
            } else {
                return new int[]{leftPointer + 1, rightPointer + 1};
            }
        }

        return new int[]{};
    }

}

