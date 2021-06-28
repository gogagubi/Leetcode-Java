package com.leetcode.example.array;


public class _26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        if (false) {
            _26_RemoveDuplicatesFromSortedArray c = new _26_RemoveDuplicatesFromSortedArray();

            int[] nums = {1, 1, 2};
            System.out.println("Addition list = " + c.removeDuplicates(nums));
        }

        if (true) {
            _26_RemoveDuplicatesFromSortedArray c = new _26_RemoveDuplicatesFromSortedArray();

            int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
            System.out.println("Addition list = " + c.removeDuplicates(nums));
        }
    }

    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;

        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }

            right++;
        }

        return left + 1;
    }

}
