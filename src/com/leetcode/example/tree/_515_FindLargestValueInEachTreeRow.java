package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _515_FindLargestValueInEachTreeRow {
    public static void main(String[] args) {
        _515_FindLargestValueInEachTreeRow c = new _515_FindLargestValueInEachTreeRow();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _515_FindLargestValueInEachTreeRow c = new _515_FindLargestValueInEachTreeRow();

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(3, new TreeNode(5), new TreeNode(3));
            root.right = new TreeNode(2, null, new TreeNode(9));

            System.out.println("largest values = " + c.largestValues(root));
        }
    }

    public List<Integer> largestValuesV1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            int max = Integer.MIN_VALUE;

            while ((currentSize--) > 0) {
                TreeNode current = queue.poll();
                max = Math.max(current.val, max);

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            result.add(max);
        }

        return result;
    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        largestValuesRecursive(root, result, 0);
        return result;
    }

    public void largestValuesRecursive(TreeNode root, List<Integer> largestVals, int level) {
        if (root == null) {
            return;
        }

        if (level == largestVals.size()) {
            largestVals.add(root.val);
        } else {
            largestVals.set(level, Math.max(largestVals.get(level), root.val));
        }

        largestValuesRecursive(root.left, largestVals, level + 1);
        largestValuesRecursive(root.right, largestVals, level + 1);
    }

}
