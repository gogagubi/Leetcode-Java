package com.leetcode.example.array;

public class _1848_MinimumDistanceToTheTargetElement {
    public static void main(String[] args) {
        if (true) {
            _1848_MinimumDistanceToTheTargetElement c = new _1848_MinimumDistanceToTheTargetElement();
            int[] nums = {1, 2, 3, 4, 5};
            int target = 5;
            int start = 3;
            System.out.println(c.getMinDistance(nums, target, start));
        }

        if (true) {
            _1848_MinimumDistanceToTheTargetElement c = new _1848_MinimumDistanceToTheTargetElement();
            int[] nums = {1};
            int target = 1;
            int start = 0;
            System.out.println(c.getMinDistance(nums, target, start));
        }

        if (true) {
            _1848_MinimumDistanceToTheTargetElement c = new _1848_MinimumDistanceToTheTargetElement();
            int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
            int target = 1;
            int start = 0;
            System.out.println(c.getMinDistance(nums, target, start));
        }

        if (true) {
            _1848_MinimumDistanceToTheTargetElement c = new _1848_MinimumDistanceToTheTargetElement();
            int[] nums = {5, 3, 6};
            int target = 5;
            int start = 2;
            System.out.println(c.getMinDistance(nums, target, start));
        }

    }

    public int getMinDistance(int[] nums, int target, int start) {
        int ans = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans = Math.min(ans, Math.abs(i - start));
            }
        }

        return ans;
    }

}
