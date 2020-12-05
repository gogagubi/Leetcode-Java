package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _94_BinaryTreeInOrderTraversal {
    public static void main(String[] args) {
        _94_BinaryTreeInOrderTraversal c = new _94_BinaryTreeInOrderTraversal();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _94_BinaryTreeInOrderTraversal c = new _94_BinaryTreeInOrderTraversal();


            TreeNode root = new TreeNode(1);

            TreeNode node1 = new TreeNode(2);
            root.right = node1;

            TreeNode node2 = new TreeNode(3);
            node1.left = node2;

            System.out.println("Post order traversal = " + c.inorderTraversal(root));
            System.out.println("Post order traversal = " + c.inorderTraversalV2(root));
        }

        //example 2
        if (true) {
            _94_BinaryTreeInOrderTraversal c = new _94_BinaryTreeInOrderTraversal();


            TreeNode root = new TreeNode(1);

            TreeNode node2 = new TreeNode(2);
            root.left = node2;

            TreeNode node3 = new TreeNode(3);
            root.right = node3;

            node2.left = new TreeNode(4);
            node2.right = new TreeNode(5);

            node3.left = new TreeNode(6);
            node3.right = new TreeNode(7);

            System.out.println("In order traversal = " + c.inorderTraversal(root));
            System.out.println("In order traversal = " + c.inorderTraversalV2(root));
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }

    public List<Integer> inorderTraversalV2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        inorderTraversalRecursion(root, result);
        return result;
    }


    public void inorderTraversalRecursion(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inorderTraversalRecursion(node.left, result);
        result.add(node.val);
        inorderTraversalRecursion(node.right, result);
    }

}
