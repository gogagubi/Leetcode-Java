package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _112_PathSum {
    public static void main(String[] args) {
        _112_PathSum c = new _112_PathSum();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _112_PathSum c = new _112_PathSum();

            int sum = 22;

            TreeNode root = new TreeNode(5);
            root.left = new TreeNode(4, new TreeNode(11), null);
            root.right = new TreeNode(8, new TreeNode(13), new TreeNode(4));

            root.left.left.left = new TreeNode(7);
            root.left.left.right = new TreeNode(2);

            root.right.right.right = new TreeNode(1);

            System.out.println("Inverted tree result = " + c.hasPathSum(root, sum));
        }

        if (true) {
            _112_PathSum c = new _112_PathSum();

            int sum = 1;

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(1);

            System.out.println("Path contains = " + c.hasPathSum(root, sum));
        }
    }

    //Using stack
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        nodeStack.add(root);
        sumStack.add(sum - root.val);

        while (!nodeStack.isEmpty()) {
            TreeNode currentNode = nodeStack.pop();
            int currentSum = sumStack.pop();

            if (currentNode.left == null && currentNode.right == null && currentSum == 0) {
                return true;
            }

            if (currentNode.left != null) {
                nodeStack.add(currentNode.left);
                sumStack.add(currentSum - currentNode.left.val);
            }

            if (currentNode.right != null) {
                nodeStack.add(currentNode.right);
                sumStack.add(currentSum - currentNode.right.val);
            }
        }

        return false;
    }

    //Using queue
    public boolean hasPathSumV1(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> sumQueue = new LinkedList<>();

        nodeQueue.add(root);
        sumQueue.add(sum - root.val);

        while (!nodeQueue.isEmpty()) {
            TreeNode currentNode = nodeQueue.poll();
            int currentSum = sumQueue.poll();

            if (currentNode.left == null && currentNode.right == null && currentSum == 0) {
                return true;
            }

            if (currentNode.left != null) {
                nodeQueue.add(currentNode.left);
                sumQueue.add(currentSum - currentNode.left.val);
            }

            if (currentNode.right != null) {
                nodeQueue.add(currentNode.right);
                sumQueue.add(currentSum - currentNode.right.val);
            }
        }

        return false;
    }

    //Using recursion
    public boolean hasPathSumV3(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        sum = sum - root.val;

        if (sum == 0 && root.left == null && root.right == null) {
            return true;
        }

        return hasPathSumV3(root.left, sum) || hasPathSumV3(root.right, sum);
    }


}
