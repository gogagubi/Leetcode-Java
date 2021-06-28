package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _297_SerializeDeserializeBinaryTree {
    public static void main(String[] args) {
        _297_SerializeDeserializeBinaryTree c = new _297_SerializeDeserializeBinaryTree();
        c.start();
    }

    public void start() {
        if (false) {
            _297_SerializeDeserializeBinaryTree c = new _297_SerializeDeserializeBinaryTree();

            Integer[] data = {1, 2, 3, null, null, 4, 5};
            TreeNode root = new TreeNode(data);

            String serialized = c.serialize(root);
            System.out.println("Serialized " + serialized);
            System.out.println("Deserialized " + c.deserialize(serialized));
        }

        if (true) {
            _297_SerializeDeserializeBinaryTree c = new _297_SerializeDeserializeBinaryTree();

            Integer[] data = {1, 2, 5, 3, null, 4, 6};
            TreeNode root = new TreeNode(data);

            String serialized = c.serialize(root);
            System.out.println("Serialized " + serialized);
            System.out.println("Deserialized " + c.deserialize(serialized));
            //expect [1,2,5,3,null,4,6]
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();

        if (root == null) {
            return result.append("[]").toString();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //I use this to find null values at right and delete from this position
        int marker = -1;

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            result.append(result.length() == 0 ? '[' : ',');

            if (current != null) {
                result.append(current.val);
                queue.add(current.left);
                queue.add(current.right);
                marker = -1;
            } else {
                if (marker == -1) {
                    marker = result.length();
                }

                result.append("null");
            }
        }

        if (marker != -1) {
            result.delete(marker - 1, result.length());
        }

        return result.append("]").toString();
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0 || data.equals("[]")) {
            return null;
        }

        String[] chunks = data.substring(1, data.length() - 1).split(",");

        Queue<Integer> values = new LinkedList<>();
        for (String s : chunks) {
            if (!s.isEmpty()) {
                values.add(s.equals("null") ? null : Integer.parseInt(s));
            }
        }

        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode root = new TreeNode(values.poll());
        queue.add(root);

        while (!values.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    Integer leftValue = values.poll();
                    if (leftValue != null) {
                        node.left = new TreeNode(leftValue);
                        queue.add(node.left);
                    }

                    Integer rightValue = values.poll();
                    if (rightValue != null) {
                        node.right = new TreeNode(rightValue);
                        queue.add(node.right);
                    }
                }
            }
        }

        return root;
    }


}
