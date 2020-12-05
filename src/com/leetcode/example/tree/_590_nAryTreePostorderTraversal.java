package com.leetcode.example.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _590_nAryTreePostorderTraversal {
    public static void main(String[] args) {
        _590_nAryTreePostorderTraversal c = new _590_nAryTreePostorderTraversal();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _590_nAryTreePostorderTraversal c = new _590_nAryTreePostorderTraversal();

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
            System.out.println("Post order traversal = " + c.postorder(root));
            System.out.println("Post order traversal = " + c.postorderV2(root));
        }

    }


    public List<Integer> postorder(Node root) {
        Stack<Node> stack = new Stack<>();
        LinkedList<Integer> outputArr = new LinkedList<>();

        if (root == null) {
            return outputArr;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            outputArr.addFirst(node.val);

            if (node.children != null) {
                for (Node child : node.children) {
                    stack.add(child);
                }
            }
        }

        return outputArr;
    }

    public List<Integer> postorderV2(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        postOrderTraversal(root, result);
        return result;
    }

    public void postOrderTraversal(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        if (node.children != null) {
            for (Node n : node.children) {
                postOrderTraversal(n, result);
            }
        }

        result.add(node.val);
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
