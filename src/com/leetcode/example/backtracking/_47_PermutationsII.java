package com.leetcode.example.backtracking;

import java.util.*;

public class _47_PermutationsII {
    public static void main(String[] args) {
        if (false) {
            _47_PermutationsII c = new _47_PermutationsII();

            int[] nums = {1, 1, 2};
            System.out.println("All cases " + c.permuteUnique(nums));
        }

        if (true) {
            _47_PermutationsII c = new _47_PermutationsII();

            int[] nums = {2, 2, 1, 1};
            System.out.println("All cases " + c.permuteUnique(nums));
        }

    }

    public List<List<Integer>> permuteUnique(int[] nums) {
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

        HashSet<Integer> set = new HashSet<>();
        for (int i = position; i < nums.length; i++) {
            if(set.add(nums[i])) {
                swap(nums, i, position);
                backtrack(position + 1, nums, list);
                swap(nums, i, position);
            }
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
