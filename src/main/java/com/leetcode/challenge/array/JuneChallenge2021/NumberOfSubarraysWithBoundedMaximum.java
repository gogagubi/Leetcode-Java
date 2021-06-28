package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

//2021-06-18
public class NumberOfSubarraysWithBoundedMaximum {

    @Test
    public void testCase1() {
        NumberOfSubarraysWithBoundedMaximum c = new NumberOfSubarraysWithBoundedMaximum();
        int[] nums = {2, 1, 4, 3};
        int left = 2;
        int right = 3;
        assertEquals(3, c.numSubarrayBoundedMax(nums, left, right));
    }

    @Test
    public void testCase2() {
        NumberOfSubarraysWithBoundedMaximum c = new NumberOfSubarraysWithBoundedMaximum();
        int[] nums = {0, 3, 1, 5, 1, 2};
        int left = 2;
        int right = 4;
        assertEquals(6, c.numSubarrayBoundedMax(nums, left, right));
    }

    @Test
    public void testCase3() {
        NumberOfSubarraysWithBoundedMaximum c = new NumberOfSubarraysWithBoundedMaximum();
        int[] nums = {0, 3, 1, 2, 0, 5, 1, 2};
        int left = 2;
        int right = 4;
        assertEquals(14, c.numSubarrayBoundedMax(nums, left, right));
    }

    @Test
    public void testCase4() {
        NumberOfSubarraysWithBoundedMaximum c = new NumberOfSubarraysWithBoundedMaximum();
        int[] nums = {1, 4, 2, 6, 2, 3, 8, 5, 2};
        int left = 3;
        int right = 5;
        assertEquals(8, c.numSubarrayBoundedMax(nums, left, right));
    }

    @Test
    public void testCase5() {
        NumberOfSubarraysWithBoundedMaximum c = new NumberOfSubarraysWithBoundedMaximum();
        int[] nums = {73, 55, 36, 5, 55, 14, 9, 7, 72, 52};
        int left = 32;
        int right = 69;
        assertEquals(22, c.numSubarrayBoundedMax(nums, left, right));
    }


    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0;

        int passed = 0;
        int last = 0;

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];

            if (curr > right) {
                passed = 0;
                last = 0;
                continue;
            }

            if (curr >= left && curr <= right) {
                last = passed + 1;
                ans += last;
            } else if (curr < left) {
                ans += last;
            }

            passed += 1;
        }

        return ans;
    }


}
