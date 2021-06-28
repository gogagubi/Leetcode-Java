package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

public class _104_MaximumDepthBinaryTree {
    public static void main(String[] args) {
        _104_MaximumDepthBinaryTree c = new _104_MaximumDepthBinaryTree();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _104_MaximumDepthBinaryTree c = new _104_MaximumDepthBinaryTree();

            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(9);
            root.right = new TreeNode(2, new TreeNode(15), new TreeNode(7));

            System.out.println("Maximum depth = " + c.maxDepth(root));
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

}
