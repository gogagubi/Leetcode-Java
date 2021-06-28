package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

public class _226_InvertBinaryTree {
    public static void main(String[] args) {
        _226_InvertBinaryTree c = new _226_InvertBinaryTree();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _226_InvertBinaryTree c = new _226_InvertBinaryTree();

            TreeNode root = new TreeNode(4);
            root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
            root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));

            System.out.println("Inverted tree result = " + c.invertTree(root));
            //System.out.println("Inverted tree result = " + c.invertTreeV1(root));
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;
    }

    public TreeNode invertTreeV1(TreeNode root) {
        if (root == null) {
            return root;
        }

        if (root.left == null && root.right == null) {
            return root;
        }

        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;

        invertTreeV1(root.left);
        invertTreeV1(root.right);
        return root;
    }
}
