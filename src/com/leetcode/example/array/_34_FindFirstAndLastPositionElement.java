package com.leetcode.example.array;


import com.leetcode.statics.util.Util;

public class _34_FindFirstAndLastPositionElement {
    public static void main(String[] args) {
        if (true) {
            _34_FindFirstAndLastPositionElement c = new _34_FindFirstAndLastPositionElement();

            int[] nums = {5, 7, 7, 8, 8, 10};
            int target = 8;
            System.out.println("Range " + Util.getPrintedArr(c.searchRange(nums, target)));
        }

        if (true) {
            _34_FindFirstAndLastPositionElement c = new _34_FindFirstAndLastPositionElement();

            int[] nums = {5, 7, 7, 8, 8, 10};
            int target = 6;
            System.out.println("Range " + Util.getPrintedArr(c.searchRange(nums, target)));
        }
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (result[0] == -1) {
                    result[0] = result[1] = i;
                } else {
                    result[1] = i;
                }
            }
        }

        return result;
    }

}
