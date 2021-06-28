package com.leetcode.example.sliding_window;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class _239_SlidingWindowMaximum {
    public static void main(String[] args) {
        if (true) {
            _239_SlidingWindowMaximum c = new _239_SlidingWindowMaximum();

            int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
            int k = 3;
            System.out.println(Arrays.toString(c.maxSlidingWindow(nums, k))); //[3, 3, 5, 5, 6, 7]
        }

        if (true) {
            _239_SlidingWindowMaximum c = new _239_SlidingWindowMaximum();

            int[] nums = {1};
            int k = 1;
            System.out.println(Arrays.toString(c.maxSlidingWindow(nums, k))); //[1]
        }

        if (true) {
            _239_SlidingWindowMaximum c = new _239_SlidingWindowMaximum();

            int[] nums = {1, -1};
            int k = 1;
            System.out.println(Arrays.toString(c.maxSlidingWindow(nums, k))); //[1,-1]
        }

        if (true) {
            _239_SlidingWindowMaximum c = new _239_SlidingWindowMaximum();

            int[] nums = {7, 2, 4};
            int k = 2;
            System.out.println(Arrays.toString(c.maxSlidingWindow(nums, k))); //[7, 4]
        }

        if (true) {
            _239_SlidingWindowMaximum c = new _239_SlidingWindowMaximum();

            int[] nums = {1, 3, 1, 2, 0, 5};
            int k = 3;
            System.out.println(Arrays.toString(c.maxSlidingWindow(nums, k))); //[3,3,2,5]
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) deque.removeFirst();

            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) deque.removeLast();
            deque.addLast(i);

            if (i >= k - 1) result[i - k + 1] = nums[deque.peekFirst()];
        }

        return result;
    }

}
