package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

public class _1038_BinarySearchTreeGreatherSumTree {
    public static void main(String[] args) {
        _1038_BinarySearchTreeGreatherSumTree c = new _1038_BinarySearchTreeGreatherSumTree();
        c.start();
    }

    public void start() {
        if (true) {
            _1038_BinarySearchTreeGreatherSumTree c = new _1038_BinarySearchTreeGreatherSumTree();

            TreeNode root = new TreeNode(4);
            root.left = new TreeNode(1, new TreeNode(0), new TreeNode(2));
            root.right = new TreeNode(6, new TreeNode(5), new TreeNode(7));

            root.left.right.right = new TreeNode(3);
            root.right.right.right = new TreeNode(8);

            System.out.println("New tree = " + c.bstToGst(root));
        }


    }

    public TreeNode bstToGst(TreeNode root) {
        doSum(root, 0);
        return root;
    }

    private int doSum(TreeNode root, int inheritedVal) {
        if (root.right != null) {
            root.val += doSum(root.right, inheritedVal);
            return (root.left == null) ? root.val : doSum(root.left, root.val);
        } else {
            root.val += inheritedVal;
            return (root.left == null) ? root.val : doSum(root.left, root.val);
        }
    }


}
