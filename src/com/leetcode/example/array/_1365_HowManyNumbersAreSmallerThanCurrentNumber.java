package com.leetcode.example.array;

import java.util.Arrays;

public class _1365_HowManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _1365_HowManyNumbersAreSmallerThanCurrentNumber c = new _1365_HowManyNumbersAreSmallerThanCurrentNumber();
            int[] nums = {8, 1, 2, 2, 3};
            System.out.println("Smaller elements = " + Arrays.toString(c.smallerNumbersThanCurrent(nums)));
        }

        //example 2
        if (true) {
            _1365_HowManyNumbersAreSmallerThanCurrentNumber c = new _1365_HowManyNumbersAreSmallerThanCurrentNumber();
            int[] nums = {6, 5, 4, 8};
            System.out.println("Smaller elements = " + Arrays.toString(c.smallerNumbersThanCurrent(nums)));
        }

        //example 3
        if (true) {
            _1365_HowManyNumbersAreSmallerThanCurrentNumber c = new _1365_HowManyNumbersAreSmallerThanCurrentNumber();
            int[] nums = {7, 7, 7, 7};
            System.out.println("Smaller elements = " + Arrays.toString(c.smallerNumbersThanCurrent(nums)));
        }
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int elementsSmaller = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    elementsSmaller++;
                }
            }

            arr[i] = elementsSmaller;
        }

        return arr;
    }


}
