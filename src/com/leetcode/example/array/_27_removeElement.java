package com.leetcode.example.array;


public class _27_removeElement {
    public static void main(String[] args) {
        if (true) {
            _27_removeElement c = new _27_removeElement();

            int[] nums = {3, 2, 2, 3};
            int val = 3;
            System.out.println("Array left " + c.removeElement(nums, val));
        }

        if (true) {
            _27_removeElement c = new _27_removeElement();

            int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
            int val = 2;
            System.out.println("Array left " + c.removeElement(nums, val));
        }
    }

    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            while (left <= right && nums[right] == val) {
                right--;
            }

            while (left <= right && nums[left] != val) {
                left++;
            }

            if(left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }

        return left;
    }

}
