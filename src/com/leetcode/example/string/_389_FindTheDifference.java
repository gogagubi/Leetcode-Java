package com.leetcode.example.string;

import java.util.ArrayList;
import java.util.List;

//THIS BOYER AND MOORE I DON'T KNOW YET. I need to think about it
public class _389_FindTheDifference {
    public static void main(String[] args) {
        if (false) {
            _389_FindTheDifference c = new _389_FindTheDifference();

            int[] nums = {3, 2, 3};
            System.out.println("Result " + c.majorityElement(nums));
        }

        if (true) {
            _389_FindTheDifference c = new _389_FindTheDifference();

            int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};
            System.out.println("Result " + c.majorityElement(nums));
        }
    }

    public List<Integer> majorityElement(int[] nums) {
        int x = 0;
        int y = 0;
        int freqX = 0;
        int freqY = 0;
        for (int i = 0; i < nums.length; i++) {
            if (freqX <= 0 && nums[i] != y)
                x = nums[i];
            if (freqY <= 0 && nums[i] != x)
                y = nums[i];
            freqX += (nums[i] == x) ? 2 : -1;
            freqY += (nums[i] == y) ? 2 : -1;
        }

        freqX = 0;
        freqY = 0;
        for (int n : nums)
            if (n == x)
                freqX++;
            else if (n == y)
                freqY++;

        List<Integer> ans = new ArrayList<>();
        int third = Math.floorDiv(nums.length, 3);
        if (freqX > third)
            ans.add(x);
        if (freqY > third)
            ans.add(y);
        return ans;
    }

}
