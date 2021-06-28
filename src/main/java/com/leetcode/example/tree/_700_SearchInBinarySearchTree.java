package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _700_SearchInBinarySearchTree {
    public static void main(String[] args) {
        _700_SearchInBinarySearchTree c = new _700_SearchInBinarySearchTree();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _700_SearchInBinarySearchTree c = new _700_SearchInBinarySearchTree();

            TreeNode root = new TreeNode(4);
            root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
            root.right = new TreeNode(7);

            int val = 2;
            System.out.println("Found Tree = " + c.searchBST(root, val));
        }

    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode result = null;
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.val == val) {
                result = root;
                break;
            }

            if (root.left != null) {
                queue.add(root.left);
            }

            if (root.right != null) {
                queue.add(root.right);
            }
        }

        return result;
    }

}
