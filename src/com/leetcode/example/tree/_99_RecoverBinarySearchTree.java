package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

public class _99_RecoverBinarySearchTree {
    public static void main(String[] args) {
        _99_RecoverBinarySearchTree c = new _99_RecoverBinarySearchTree();
        c.start();
    }

    public void start() {
        if (false) {
            _99_RecoverBinarySearchTree c = new _99_RecoverBinarySearchTree();

            Integer[] data = {1, 3, null, null, 2};
            TreeNode root = new TreeNode(data);

            c.recoverTree(root);
            System.out.println("Recovered " + root);
        }

        if (true) {
            _99_RecoverBinarySearchTree c = new _99_RecoverBinarySearchTree();

            Integer[] data = {3, 1, 4, null, null, 2};
            TreeNode root = new TreeNode(data);

            c.recoverTree(root);
            System.out.println("Recovered " + root);
        }

        if (false) {
            _99_RecoverBinarySearchTree c = new _99_RecoverBinarySearchTree();

            Integer[] data = {2, 3, 1};
            TreeNode root = new TreeNode(data);

            c.recoverTree(root);
            System.out.println("Recovered " + root);
        }

        if (false) {
            _99_RecoverBinarySearchTree c = new _99_RecoverBinarySearchTree();

            Integer[] data = {3, null, 2, null, 1};
            TreeNode root = new TreeNode(data);

            c.recoverTree(root);
            System.out.println("Recovered " + root);
        }

        if (false) {
            _99_RecoverBinarySearchTree c = new _99_RecoverBinarySearchTree();

            Integer[] data = {10, 15, 5, 4, 7, 14, 17};
            TreeNode root = new TreeNode(data);

            c.recoverTree(root);
            System.out.println("Recovered " + root);
        }
    }

    TreeNode prevNode;
    TreeNode node1;
    TreeNode node2;

    public void recoverTree(TreeNode root) {
        recoverTreeRec(root);

        if (node1 != null && node2 != null) {
            int val = node1.val;
            node1.val = node2.val;
            node2.val = val;
        }
    }

    public void recoverTreeRec(TreeNode root) {
        if (root == null) {
            return;
        }

        recoverTreeRec(root.left);
        if (prevNode != null) {
            if (prevNode.val > root.val) {
                if (node1 == null) {
                    node1 = prevNode;
                }

                node2 = root;
            }
        }
        prevNode = root;
        recoverTreeRec(root.right);
    }

}
