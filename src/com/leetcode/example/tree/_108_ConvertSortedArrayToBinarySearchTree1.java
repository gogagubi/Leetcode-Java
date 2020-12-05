package com.leetcode.example.tree;


import com.leetcode.statics.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _108_ConvertSortedArrayToBinarySearchTree1 {
    public static void main(String[] args) {
        if (true) {
            _108_ConvertSortedArrayToBinarySearchTree1 c = new _108_ConvertSortedArrayToBinarySearchTree1();

            int[] A = {-10, -3, 0, 5, 9};
            System.out.println("Result tree " + c.sortedArrayToBST(A).show());
        }

    }


    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode node = null;
        if (nums == null || nums.length == 0) {
            return node;
        }

        Queue<TreeNode> nodes = new LinkedList<>();

        int middle, from, to;

        middle = (nums.length - 1) / 2;
        node = new TreeNode(nums[middle]);
        nodes.add(node);

        Queue<Integer> indexes = new LinkedList<>();
        indexes.add(0);
        indexes.add(middle - 1);
        indexes.add(middle + 1);
        indexes.add(nums.length - 1);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = nodes.poll();

                for (int k = 0; k < 2; k++) {
                    from = indexes.poll();
                    to = indexes.poll();

                    if (from <= to) {
                        middle = (from + to) / 2;

                        if (k == 0) {
                            current.left = new TreeNode(nums[middle]);
                            nodes.add(current.left);
                        } else {
                            current.right = new TreeNode(nums[middle]);
                            nodes.add(current.right);
                        }

                        indexes.add(from);
                        indexes.add(middle - 1);
                        indexes.add(middle + 1);
                        indexes.add(to);
                    }
                }
            }
        }

        return node;
    }


}
