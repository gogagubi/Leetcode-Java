package com.leetcode.challenge.array.JuneChallenge2021;

import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        //example 1
        if (true) {
            LongestConsecutiveSequence c = new LongestConsecutiveSequence();
            int[] nums = {100, 4, 200, 1, 3, 2};
            int res = c.longestConsecutive(nums);
            System.out.println(res + " " + (res == 4));
        }

        //example 2
        if (true) {
            LongestConsecutiveSequence c = new LongestConsecutiveSequence();
            int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
            int res = c.longestConsecutive(nums);
            System.out.println(res + " " + (res == 9));
        }

        //example 3
        if (true) {
            LongestConsecutiveSequence c = new LongestConsecutiveSequence();
            int[] nums = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
            int res = c.longestConsecutive(nums);
            System.out.println(res + " " + (res == 7));
        }
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new TreeSet<>();
        for (int elem : nums) {
            set.add(elem);
        }

        int count = 0, maxCount = 0;
        Integer prev = null;
        for (int elem : set) {
            if (prev == null) {
                count = 1;
            } else {
                if (elem - 1 == prev) {
                    count += 1;
                } else {
                    count = 1;
                }
            }
            maxCount = Math.max(maxCount, count);
            prev = elem;
        }

        return maxCount;
    }

}
