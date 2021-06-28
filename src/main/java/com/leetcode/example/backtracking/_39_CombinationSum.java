package com.leetcode.example.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class _39_CombinationSum {
    public static void main(String[] args) {
        if (true) {
            _39_CombinationSum c = new _39_CombinationSum();

            int[] candidates = {2, 3, 6, 7};
            int target = 7;
            System.out.println("All cases " + c.combinationSum(candidates, target));
        }

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, 0, new LinkedList<>(), result);
        return result;
    }

    public void backtrack(int[] candidates, int target, int position, int sum, LinkedList<Integer> sumList, List<List<Integer>> result) {
        if (sum > target) {
            return;
        }

        if (sum == target) {
            List<Integer> list = sumList.stream().collect(Collectors.toList());
            result.add(list);
            return;
        }

        for (int i = position; i < candidates.length; i++) {
            sum += candidates[i];
            sumList.add(candidates[i]);
            backtrack(candidates, target, i, sum, sumList, result);
            sumList.removeLast();
            sum -= candidates[i];
        }
    }

}
