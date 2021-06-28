package com.leetcode.example.array;


public class _80_RemoveDuplicatesFromSorterdArray {
    public static void main(String[] args) {
        if (true) {
            _80_RemoveDuplicatesFromSorterdArray c = new _80_RemoveDuplicatesFromSorterdArray();

            int[] nums = {1, 1, 1, 2, 2, 3};
            System.out.println("New length " + c.removeDuplicates(nums));
        }

        if (true) {
            _80_RemoveDuplicatesFromSorterdArray c = new _80_RemoveDuplicatesFromSorterdArray();

            int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
            System.out.println("New length " + c.removeDuplicates(nums));
        }

        if (true) {
            _80_RemoveDuplicatesFromSorterdArray c = new _80_RemoveDuplicatesFromSorterdArray();

            int[] nums = {1, 2};
            System.out.println("New length " + c.removeDuplicates(nums));
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0, right = 0;
        while (right < nums.length) {
            if (left < 2 || nums[left - 2] != nums[right]) {
                nums[left] = nums[right];
                left++;
            }

            right++;
        }

        return left;
    }

}
