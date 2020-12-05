package com.leetcode.example.array;

import java.util.ArrayList;
import java.util.List;

public class _442_FindAllDuplicatesInArray {
    public static void main(String[] args) {
        if (true) {
            _442_FindAllDuplicatesInArray c = new _442_FindAllDuplicatesInArray();

            int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
            System.out.println("Duplicates " + c.findDuplicates(nums));
        }
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(index + 1);
            }

            nums[index] = nums[index] * -1;
        }

        return result;
    }

}
