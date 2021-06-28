package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

public class _617_MergeTwoBinaryTrees {
    public static void main(String[] args) {
        _617_MergeTwoBinaryTrees c = new _617_MergeTwoBinaryTrees();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _617_MergeTwoBinaryTrees c = new _617_MergeTwoBinaryTrees();

            TreeNode leftTree = new TreeNode(1);
            leftTree.left = new TreeNode(3, new TreeNode(5), null);
            leftTree.right = new TreeNode(2);

            TreeNode rightTree = new TreeNode(2);
            rightTree.left = new TreeNode(1, null, new TreeNode(4));
            rightTree.right = new TreeNode(3, null, new TreeNode(7));

            System.out.println("Binary tree merge result = " + c.mergeTrees(leftTree, rightTree));
        }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }

        if (t2 == null) {
            return t1;
        }

        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }

}
