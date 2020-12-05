package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.Stack;

public class _101_SymmetricTree {
    public static void main(String[] args) {
        _101_SymmetricTree c = new _101_SymmetricTree();
        c.start();
    }

    public void start() {
        //example 1
        if (false) {
            _101_SymmetricTree c = new _101_SymmetricTree();

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
            root.right = new TreeNode(2, new TreeNode(4), new TreeNode(3));

            System.out.println("Symmetric = " + c.isSymmetric(root));
        }

        //example 2
        if (false) {
            _101_SymmetricTree c = new _101_SymmetricTree();

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2, null, new TreeNode(3));
            root.right = new TreeNode(2, null, new TreeNode(3));

            System.out.println("Symmetric = " + c.isSymmetric(root));
        }

        //example 3
        if (false) {
            _101_SymmetricTree c = new _101_SymmetricTree();

            TreeNode root = new TreeNode(1);
            TreeNode left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
            TreeNode right = new TreeNode(2, new TreeNode(4), new TreeNode(3));
            root.left = left;
            root.right = right;

            left.left.left = new TreeNode(14);
            left.left.right = new TreeNode(15);
            left.right.left = new TreeNode(15);
            left.right.right = new TreeNode(14);


            right.left.left = new TreeNode(14);
            right.left.right = new TreeNode(15);
            right.right.left = new TreeNode(15);
            right.right.right = new TreeNode(14);


            System.out.println("Symmetric = " + c.isSymmetric(root));
        }

        //example 1
        if (true) {
            _101_SymmetricTree c = new _101_SymmetricTree();

            TreeNode root = new TreeNode(2);
            root.left = new TreeNode(3, new TreeNode(4), new TreeNode(5));
            root.right = new TreeNode(3, new TreeNode(5), null);

            System.out.println("Symmetric = " + c.isSymmetric(root));
        }


    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root.left);
        stack.add(root.right);

        while (!stack.empty()) {
            TreeNode node1 = stack.pop();
            TreeNode node2 = stack.pop();

            if (node1 == null && node2 == null) {
                continue;
            }

            if (node1 == null || node2 == null) {
                return false;
            }


            if (node1.val != node2.val) {
                return false;
            }

            stack.add(node1.left);
            stack.add(node2.right);
            stack.add(node2.left);
            stack.add(node1.right);
        }

        return true;
    }

    public boolean isSymmetric1(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }

        if (t1 == null || t2 == null) {
            return false;
        }

        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

}
