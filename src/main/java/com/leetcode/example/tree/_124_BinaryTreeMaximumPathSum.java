package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

public class _124_BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        _124_BinaryTreeMaximumPathSum c = new _124_BinaryTreeMaximumPathSum();
        c.start();
    }

    public void start() {
        //example 1
        if (false) {
            _124_BinaryTreeMaximumPathSum c = new _124_BinaryTreeMaximumPathSum();

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            System.out.println("Inserted tree = " + c.maxPathSum(root));
        }

        if (false) {
            _124_BinaryTreeMaximumPathSum c = new _124_BinaryTreeMaximumPathSum();

            TreeNode root = new TreeNode(-10);
            root.left = new TreeNode(9);
            root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));
            System.out.println("Inserted tree = " + c.maxPathSum(root));
        }

        if (false) {
            _124_BinaryTreeMaximumPathSum c = new _124_BinaryTreeMaximumPathSum();

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(-2);
            root.right = new TreeNode(3);
            System.out.println("Inserted tree = " + c.maxPathSum(root));
        }

        if (true) {
            _124_BinaryTreeMaximumPathSum c = new _124_BinaryTreeMaximumPathSum();

            TreeNode root = new TreeNode(5);
            root.left = new TreeNode(4, new TreeNode(11), null);
            root.right = new TreeNode(8, new TreeNode(13), new TreeNode(4));
            root.left.left.left = new TreeNode(7);
            root.left.left.right = new TreeNode(2);
            root.right.right.right = new TreeNode(1);
            System.out.println("Inserted tree = " + c.maxPathSum(root));
        }

        if (true) {
            _124_BinaryTreeMaximumPathSum c = new _124_BinaryTreeMaximumPathSum();

            Integer []tree = {10,9,20,null,null,15,7};
            TreeNode root = new TreeNode(tree);
            System.out.println("Inserted tree = " + c.maxPathSum(root));
        }


    }


    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathSumRecursive(root);
        return max;
    }

    public int maxPathSumRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxPathSumRecursive(root.left);
        int right = maxPathSumRecursive(root.right);

        max = Math.max(max, left + right + root.val);
        max = Math.max(max, left + root.val);
        max = Math.max(max, right + root.val);
        max = Math.max(max, root.val);

        int sum = Math.max(left, right) + root.val;
        sum = Math.max(sum, root.val);

        return sum;
    }

}
