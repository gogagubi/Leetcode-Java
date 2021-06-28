package com.leetcode.example.array;

import java.util.ArrayList;
import java.util.List;

public class _448_FindAllNumbersDissapearedInArray {
    public static void main(String[] args) {
        if (true) {
            _448_FindAllNumbersDissapearedInArray c = new _448_FindAllNumbersDissapearedInArray();

            int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
            System.out.println("Missing integers " + c.findDisappearedNumbers(nums));
        }
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

}
