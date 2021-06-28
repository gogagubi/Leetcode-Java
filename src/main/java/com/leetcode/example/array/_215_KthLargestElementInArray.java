package com.leetcode.example.array;

import java.util.PriorityQueue;

public class _215_KthLargestElementInArray {
    public static void main(String[] args) {
        //example 1
        if (true) {
            _215_KthLargestElementInArray c = new _215_KthLargestElementInArray();
            int[] arr = {3, 2, 1, 5, 6, 4};
            int k = 2;
            System.out.println("Kth largest element = " + c.findKthLargest(arr, k));
        }

        //example 1
        if (true) {
            _215_KthLargestElementInArray c = new _215_KthLargestElementInArray();
            int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6};
            int k = 4;
            System.out.println("Kth largest element = " + c.findKthLargest(arr, k));
        }
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : nums) {
            minHeap.add(i);

            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }

        return minHeap.remove();
    }
}
