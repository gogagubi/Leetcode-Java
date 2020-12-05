package com.leetcode.example.backtracking;

import java.util.ArrayList;
import java.util.List;

public class _46_Permutations {
    public static void main(String[] args) {
        if (true) {
            _46_Permutations c = new _46_Permutations();

            int[] nums = {1, 2, 3};
            System.out.println("All cases " + c.permute(nums));
        }


        if (false) {
            _46_Permutations c = new _46_Permutations();

            int[] nums = {1, 2, 3, 4};
            System.out.println("All cases " + c.permute(nums));
        }


        if (false) {
            _46_Permutations c = new _46_Permutations();

            int[] nums = {1, 2};
            System.out.println("All cases " + c.permute(nums));
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }

        backtrack(0, nums, list);
        return list;
    }

    public void backtrack(int position, int[] nums, List<List<Integer>> list) {
        if (position == nums.length - 1) {
            List<Integer> currentList = new ArrayList<>();
            for (int num : nums) {
                currentList.add(num);
            }

            list.add(currentList);
            return;
        }

        for (int i = position; i < nums.length; i++) {
            swap(nums, i, position);
            backtrack(position + 1, nums, list);
            swap(nums, i, position);
        }
    }

    public void swap(int[] nums, int from, int to) {
        if (from != to) {
            int tmp = nums[from];
            nums[from] = nums[to];
            nums[to] = tmp;
        }
    }


}
