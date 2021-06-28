package com.leetcode.example.array;


import com.leetcode.statics.util.Util;

public class _88_MergeSorterArray {
    public static void main(String[] args) {
        if (true) {
            _88_MergeSorterArray c = new _88_MergeSorterArray();

            int[] nums1 = {1, 2, 3, 0, 0, 0};
            int[] nums2 = {2, 5, 6};
            int m = 3, n = 3;
            c.merge(nums1, m, nums2, n);
            System.out.println("Sub arrays " + Util.getPrintedArr(nums1));
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0, right = 0, indexer = 0;
        int[] result = new int[nums1.length];

        while (left < m && right < n) {
            if (nums1[left] < nums2[right]) {
                result[indexer++] = nums1[left++];
            } else {
                result[indexer++] = nums2[right++];
            }
        }

        while (left < m) {
            result[indexer++] = nums1[left++];
        }

        while (right < n) {
            result[indexer++] = nums2[right++];
        }

        for (int i = 0; i < result.length; i++) {
            nums1[i] = result[i];
        }
    }

}
