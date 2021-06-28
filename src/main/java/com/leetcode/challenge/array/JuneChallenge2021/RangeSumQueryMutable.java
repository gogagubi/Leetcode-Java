package com.leetcode.challenge.array.JuneChallenge2021;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//2021-06-19
public class RangeSumQueryMutable {

    public static void main(String[] args) {
        RangeSumQueryMutable o = new RangeSumQueryMutable();
        o.start();
    }


    public void start() {
        if (false) {
            NumArray numArray = new NumArray(new int[]{1, 3, 5});
            numArray.sumRange(0, 2);
            numArray.update(1, 2);
            numArray.sumRange(0, 2);
        }

        if (true) {
            NumArray numArray = new NumArray(new int[]{1, 4, 3, 6, 7, 5, 2, 0, 9});
            numArray.sumRange(0, 2);
            numArray.update(1, 2);
            numArray.sumRange(0, 2);
        }
    }


    class NumArray {
        class TreeNode {
            int start;
            int end;
            int value;

            TreeNode left;
            TreeNode right;

            public TreeNode(int start, int end) {
                this.start = start;
                this.end = end;
            }
        }

        TreeNode rootNode;

        public NumArray(int[] nums) {
            rootNode = buildTree(nums, 0, nums.length - 1);
        }

        private TreeNode buildTree(int[] nums, int start, int end) {
            TreeNode node = new TreeNode(start, end);

            if (start == end) {
                node.value = nums[start];
                return node;
            }

            int middle = start + (end - start) / 2;
            node.left = buildTree(nums, start, middle);
            node.right = buildTree(nums, middle + 1, end);

            node.value = node.left.value + node.right.value;
            return node;
        }

        public void update(int index, int val) {
            updateTree(rootNode, index, val);
        }

        private void updateTree(TreeNode node, int index, int val) {
            if (node.start == node.end) {
                node.value = val;
                return;
            }

            int middle = node.start + (node.end - node.start) / 2;

            if (index <= middle) {
                updateTree(node.left, index, val);
            } else {
                updateTree(node.right, index, val);
            }

            node.value = node.left.value + node.right.value;
        }

        public int sumRange(int left, int right) {
            return sumUp(rootNode, left, right);
        }

        private int sumUp(TreeNode node, int rangeFrom, int rangeTo) {
            if (node.start == rangeFrom && node.end == rangeTo) return node.value;

            int middle = node.start + (node.end - node.start) / 2;

            if (rangeFrom >= node.start && rangeTo <= middle) {
                return sumUp(node.left, rangeFrom, rangeTo);
            } else if (rangeFrom > middle && rangeTo <= node.end) {
                return sumUp(node.right, rangeFrom, rangeTo);
            }

            return sumUp(node.left, rangeFrom, middle) + sumUp(node.right, middle + 1, rangeTo);
        }
    }


}
