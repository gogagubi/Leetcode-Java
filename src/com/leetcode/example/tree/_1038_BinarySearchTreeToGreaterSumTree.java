package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

public class _1038_BinarySearchTreeToGreaterSumTree {
    public static void main(String[] args) {
        _1038_BinarySearchTreeToGreaterSumTree c = new _1038_BinarySearchTreeToGreaterSumTree();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _1038_BinarySearchTreeToGreaterSumTree c = new _1038_BinarySearchTreeToGreaterSumTree();

            TreeNode root = new TreeNode(4);
            root.left = new TreeNode(1, new TreeNode(0), new TreeNode(2));
            root.right = new TreeNode(6, new TreeNode(5), new TreeNode(7));

            root.left.right.right = new TreeNode(3);
            root.right.right.right = new TreeNode(8);

            System.out.println("Greather sum tree \n" + c.bstToGst(root).show());
        }


    }

    public TreeNode bstToGst(TreeNode root) {
        bstToGstRecursion(root, 0);
        return root;
    }

    public int bstToGstRecursion(TreeNode root, int value) {
        if (root.right != null) {
            value = bstToGstRecursion(root.right, value);
        }
        value += root.val;
        root.val = value;

        if (root.left != null) {
            value = bstToGstRecursion(root.left, value);
        }

        return value;
    }


}
