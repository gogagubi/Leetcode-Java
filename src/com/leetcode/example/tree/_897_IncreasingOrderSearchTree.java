package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.PriorityQueue;

public class _897_IncreasingOrderSearchTree {
    public static void main(String[] args) {
        _897_IncreasingOrderSearchTree c = new _897_IncreasingOrderSearchTree();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _897_IncreasingOrderSearchTree c = new _897_IncreasingOrderSearchTree();

            TreeNode root = new TreeNode(5);
            root.left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
            root.right = new TreeNode(6, null, new TreeNode(8));

            root.left.left.left = new TreeNode(1);
            root.right.right.left = new TreeNode(7);
            root.right.right.right = new TreeNode(9);

            System.out.println("Increased = " + c.increasingBST(root));
        }


    }

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        PriorityQueue<TreeNode> queue = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);

        increasingBSTRecursion(root, queue);
        root = queue.poll();

        TreeNode tmp = root;
        while (!queue.isEmpty()) {
            tmp.right = queue.poll();
            tmp = tmp.right;
        }

        return root;
    }

    public void increasingBSTRecursion(TreeNode root, PriorityQueue<TreeNode> queue) {
        if (root == null) {
            return;
        }

        increasingBSTRecursion(root.left, queue);
        increasingBSTRecursion(root.right, queue);
        queue.add(root);
        root.left = null;
        root.right = null;
    }

}
