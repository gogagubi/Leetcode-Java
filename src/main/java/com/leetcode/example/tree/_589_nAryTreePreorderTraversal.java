package com.leetcode.example.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _589_nAryTreePreorderTraversal {
    public static void main(String[] args) {
        _589_nAryTreePreorderTraversal c = new _589_nAryTreePreorderTraversal();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _589_nAryTreePreorderTraversal c = new _589_nAryTreePreorderTraversal();

            List<Node> children2 = new ArrayList<>();
            {
                List<Node> children3 = new ArrayList<>();
                children3.add(new Node(5));
                children3.add(new Node(6));
                children2.add(new Node(3, children3));
            }
            children2.add(new Node(2));
            children2.add(new Node(4));

            Node root = new Node(1, children2);
            System.out.println("Pre order traversal = " + c.preorder(root));
            System.out.println("Pre order traversal = " + c.preorderV2(root));
        }

    }

    public List<Integer> preorder(Node root) {
        Stack<Node> stack = new Stack<>();
        LinkedList<Integer> outputArr = new LinkedList<>();

        if (root == null) {
            return outputArr;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            outputArr.add(node.val);

            if (node.children != null) {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    stack.add(node.children.get(i));
                }
            }
        }

        return outputArr;
    }

    public List<Integer> preorderV2(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        preOrderTraversal(root, result);
        return result;
    }

    public void preOrderTraversal(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        result.add(node.val);
        if (node.children != null) {
            for (Node n : node.children) {
                preOrderTraversal(n, result);
            }
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", children=" + children +
                    '}';
        }
    }

}
