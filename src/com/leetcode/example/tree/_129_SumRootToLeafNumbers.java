package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

public class _129_SumRootToLeafNumbers {
    public static void main(String[] args) {
        _129_SumRootToLeafNumbers c = new _129_SumRootToLeafNumbers();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _129_SumRootToLeafNumbers c = new _129_SumRootToLeafNumbers();

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            System.out.println("Sum = " + c.sumNumbers(root));
        }

        if (true) {
            _129_SumRootToLeafNumbers c = new _129_SumRootToLeafNumbers();

            TreeNode root = new TreeNode(4);
            root.left = new TreeNode(9, new TreeNode(5), new TreeNode(1));
            root.right = new TreeNode(0);
            System.out.println("Sum = " + c.sumNumbers(root));
        }
    }

    int sum;

    public int sumNumbers(TreeNode root) {
        sum = 0;
        sumNumbersRecursive(root, 0);
        return sum;
    }

    public void sumNumbersRecursive(TreeNode root, int num) {
        if (root == null) {
            return;
        }

        num = (num * 10) + root.val;
        if (root.left == null && root.right == null) {
            sum += num;
        }

        sumNumbersRecursive(root.left, num);
        sumNumbersRecursive(root.right, num);
    }

}
