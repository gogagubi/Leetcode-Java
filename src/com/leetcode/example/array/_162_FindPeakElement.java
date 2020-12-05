package com.leetcode.example.array;

public class _162_FindPeakElement {

    public static void main(String[] args) {
        //example 1
        if (false) {
            _162_FindPeakElement c = new _162_FindPeakElement();
            int[] nums = {1, 2, 3, 1};
            System.out.println("Peak element = " + c.findPeakElement(nums));
        }

        //example 2
        if (false) {
            _162_FindPeakElement c = new _162_FindPeakElement();
            int[] nums = {1, 2, 1, 3, 5, 6, 4};
            System.out.println("Peak element = " + c.findPeakElement(nums));
        }

        //example 3
        if (false) {
            _162_FindPeakElement c = new _162_FindPeakElement();
            int[] nums = {1, 2, 1, 3, 5, 6, 3, 0, 4, 8, 3, 5, 9, 12, 4};
            System.out.println("Peak element = " + c.findPeakElement(nums));
        }

        //example 4
        if (true) {
            _162_FindPeakElement c = new _162_FindPeakElement();
            int[] nums = {9, 6, 1, 7, 8, 5};
            System.out.println("Peak element = " + c.findPeakElement(nums));
        }

        //example 5
        if (true) {
            _162_FindPeakElement c = new _162_FindPeakElement();
            int[] nums = {9, 6, 1, 7, 8, 5};
            System.out.println("Peak element = " + c.findPeakElementV2(nums));
        }
    }

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            //int mid = left + (right - left) / 2;
            int mid = (right + left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public int findPeakElementV2(int[] nums) {
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean leftLess = false;
            boolean rightLess = false;

            if (i != 0 && nums[i] > nums[i - 1]) {
                leftLess = true;
            }

            if (i != (nums.length - 1) && nums[i] > nums[i + 1]) {
                rightLess = true;
            }

            if (leftLess || rightLess) {
                if (nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
            }
        }

        return maxIndex;
    }
}
