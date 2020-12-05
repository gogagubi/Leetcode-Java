package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

public class _222_CountCompleteTreeNodes {
    public static void main(String[] args) {
        _222_CountCompleteTreeNodes c = new _222_CountCompleteTreeNodes();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _222_CountCompleteTreeNodes c = new _222_CountCompleteTreeNodes();

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2, new TreeNode(4), new TreeNode(5));
            root.right = new TreeNode(3, new TreeNode(6), null);

            System.out.println("Count of node = " + c.countNodes(root));
        }
    }

    public int countNodes(TreeNode root) {
        int count = 0;
        if (root == null) {
            return count;
        }

        count = countNodes(root.left) + countNodes(root.right) + 1;

        return count;
    }

}
