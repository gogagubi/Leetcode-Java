package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102_BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        _102_BinaryTreeLevelOrderTraversal c = new _102_BinaryTreeLevelOrderTraversal();
        c.start();
    }

    public void start() {
        //example
        if (true) {
            _102_BinaryTreeLevelOrderTraversal c = new _102_BinaryTreeLevelOrderTraversal();

            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(9);
            root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

            System.out.println("Level order traversal = " + c.levelOrder(root));
        }


    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                list.add(current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            result.add(list);

        }

        return result;
    }

}
