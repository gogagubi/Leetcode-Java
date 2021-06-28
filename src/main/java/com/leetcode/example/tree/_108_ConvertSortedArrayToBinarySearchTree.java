package com.leetcode.example.tree;


import com.leetcode.statics.model.TreeNode;

public class _108_ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        if (true) {
            _108_ConvertSortedArrayToBinarySearchTree c = new _108_ConvertSortedArrayToBinarySearchTree();

            int[] A = {-10, -3, 0, 5, 9};
            System.out.println("Result tree " + c.sortedArrayToBST(A).show());
        }

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        TreeNode node = sortedArrayToBST(nums, 0, nums.length - 1);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums, int from, int to) {
        if (from > to) {
            return null;
        }

        int middle = (from + to) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = sortedArrayToBST(nums, from, middle - 1);
        node.right = sortedArrayToBST(nums, middle + 1, to);

        return node;
    }


}
