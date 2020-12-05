package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

public class _701_InsertIntoBinarySearchTree {
    public static void main(String[] args) {
        _701_InsertIntoBinarySearchTree c = new _701_InsertIntoBinarySearchTree();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _701_InsertIntoBinarySearchTree c = new _701_InsertIntoBinarySearchTree();

            TreeNode root = new TreeNode(4);
            root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
            root.right = new TreeNode(7);

            int val = 5;
            System.out.println("Inserted tree = " + c.insertIntoBST(root, val));
        }

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        if (val > root.val) {
            if (root.right == null) {
                root.right = new TreeNode(val);
                return root;
            }
            insertIntoBST(root.right, val);
        } else if (val < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
                return root;
            }
            insertIntoBST(root.left, val);
        }

        return root;
    }

}
