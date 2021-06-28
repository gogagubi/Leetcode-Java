package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class _113_PathSumII {
    public static void main(String[] args) {
        _113_PathSumII c = new _113_PathSumII();
        c.start();
    }

    public void start() {
        //example
        if (true) {
            _113_PathSumII c = new _113_PathSumII();

            int sum = 22;

            TreeNode root = new TreeNode(5);
            root.left = new TreeNode(4, new TreeNode(11), null);
            root.right = new TreeNode(8, new TreeNode(13), new TreeNode(4));

            root.left.left.left = new TreeNode(7);
            root.left.left.right = new TreeNode(2);

            root.right.right.left = new TreeNode(5);
            root.right.right.right = new TreeNode(1);

            System.out.println("Way of sum = " + c.pathSum(root, sum));
        }

        if (true) {
            _113_PathSumII c = new _113_PathSumII();

            int sum = 1;

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);

            System.out.println("Way of sum = " + c.pathSum(root, sum));
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths = new LinkedList<>();

        if (root == null) {
            return paths;
        }

        pathSumRecursive(root, 0, sum, paths, new Stack<>());
        return paths;
    }

    public void pathSumRecursive(TreeNode node, int matchSum, int sum, List<List<Integer>> paths,
                                 Stack<Integer> way) {
        if (node == null) {
            return;
        }

        matchSum += node.val;
        way.add(node.val);
        if (matchSum == sum && node.left == null && node.right == null) {
            List<Integer> list = way.stream().collect(Collectors.toList());
            paths.add(list);
        }

        pathSumRecursive(node.left, matchSum, sum, paths, way);
        if (node.left != null) {
            way.pop();
        }

        pathSumRecursive(node.right, matchSum, sum, paths, way);
        if (node.right != null) {
            way.pop();
        }
    }

}
