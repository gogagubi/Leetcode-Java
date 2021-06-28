package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

public class _814_BinaryTreePruning {
    public static void main(String[] args) {
        _814_BinaryTreePruning c = new _814_BinaryTreePruning();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _814_BinaryTreePruning c = new _814_BinaryTreePruning();

            TreeNode root = new TreeNode(1);
            root.right = new TreeNode(0, new TreeNode(0), new TreeNode(1));

            System.out.println("Pruned tree = " + c.pruneTree(root));
        }
    }

    public TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return null;
        }

        hasOne(root);
        return root;
    }

    public boolean hasOne(TreeNode node) {
        if (node == null) {
            return false;
        }

        boolean left = hasOne(node.left);
        boolean right = hasOne(node.right);

        if (!left) {
            node.left = null;
        }

        if (!right) {
            node.right = null;
        }

        return left || right || node.val == 1;
    }
}
