package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _437_PathSumIII {
    public static void main(String[] args) {
        _437_PathSumIII c = new _437_PathSumIII();
        c.start();
    }

    public void start() {
        //example
        if (true) {
            _437_PathSumIII c = new _437_PathSumIII();

            int sum = 8;

            TreeNode root = new TreeNode(10);
            root.left = new TreeNode(5, new TreeNode(3), new TreeNode(2));
            root.right = new TreeNode(-3, null, new TreeNode(11));

            root.left.left.left = new TreeNode(3);
            root.left.left.right = new TreeNode(-2);

            root.left.right.right = new TreeNode(1);

            System.out.println("Nums of steps in path = " + c.pathSum(root, sum));
        }


    }

    public int pathSum(TreeNode root, int sum) {
        int numberOfPaths = 0;

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            numberOfPaths += pathSumRecursive(current, 0, sum, 0);

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return numberOfPaths;
    }

    public int pathSumRecursive(TreeNode node, int matchSum, int sum, int numberOfPaths) {
        if (node == null) {
            return numberOfPaths;
        }

        matchSum += node.val;
        if (matchSum == sum) {
            numberOfPaths++;
        }


        numberOfPaths = pathSumRecursive(node.left, matchSum, sum, numberOfPaths);
        numberOfPaths = pathSumRecursive(node.right, matchSum, sum, numberOfPaths);

        return numberOfPaths;
    }

}
