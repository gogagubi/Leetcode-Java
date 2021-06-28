package com.leetcode.example.two_pointers;


public class _1855_MaximumDistanceBetweenPairOfValues {
    public static void main(String[] args) {
        if (true) {
            _1855_MaximumDistanceBetweenPairOfValues c = new _1855_MaximumDistanceBetweenPairOfValues();

            int[] nums1 = {55, 30, 5, 4, 2};
            int[] nums2 = {100, 20, 10, 10, 5};
            System.out.println(c.maxDistance(nums1, nums2));
        }

        if (true) {
            _1855_MaximumDistanceBetweenPairOfValues c = new _1855_MaximumDistanceBetweenPairOfValues();

            int[] nums1 = {2, 2, 2};
            int[] nums2 = {10, 10, 1};
            System.out.println(c.maxDistance(nums1, nums2));
        }

        if (true) {
            _1855_MaximumDistanceBetweenPairOfValues c = new _1855_MaximumDistanceBetweenPairOfValues();

            int[] nums1 = {30, 29, 19, 5};
            int[] nums2 = {25, 25, 25, 25, 25};
            System.out.println(c.maxDistance(nums1, nums2));
        }

        if (true) {
            _1855_MaximumDistanceBetweenPairOfValues c = new _1855_MaximumDistanceBetweenPairOfValues();

            int[] nums1 = {5, 4};
            int[] nums2 = {3, 2};
            System.out.println(c.maxDistance(nums1, nums2));
        }
    }

    public int maxDistance(int[] nums1, int[] nums2) {
        int ans = 0;
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                ans = Math.max(ans, j - i);
            }

            if (i < j && nums1[i] > nums2[j]) i++;
            else j++;
        }

        return ans;
    }

}
