package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _938_RangeSumBST {
    public static void main(String[] args) {
        _938_RangeSumBST c = new _938_RangeSumBST();
        c.start();
    }

    public void start() {
        //example
        if (true) {
            _938_RangeSumBST c = new _938_RangeSumBST();

            TreeNode root = new TreeNode(10);
            root.left = new TreeNode(5, new TreeNode(3), new TreeNode(7));
            root.right = new TreeNode(15, null, new TreeNode(18));

            int L = 7;
            int R = 15;

            System.out.println("Range sum BST = " + c.rangeSumBST(root, L, R));
        }


    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root == null) {
            return sum;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.val >= L && current.val <= R) {
                sum += current.val;
            }

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return sum;
    }
}
