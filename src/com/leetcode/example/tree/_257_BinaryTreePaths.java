package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class _257_BinaryTreePaths {
    public static void main(String[] args) {
        _257_BinaryTreePaths c = new _257_BinaryTreePaths();
        c.start();
    }

    public void start() {
        //example
        if (true) {
            _257_BinaryTreePaths c = new _257_BinaryTreePaths();

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2, null, new TreeNode(5));
            root.right = new TreeNode(3);

            System.out.println("Paths of binary tree = " + c.binaryTreePaths(root));
        }


    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList<>();

        if (root == null) {
            return paths;
        }


        binaryTreePathsRecursive(root, paths, new LinkedList<>());
        return paths;
    }

    public void binaryTreePathsRecursive(TreeNode node, List<String> paths, LinkedList<Integer> way) {
        if (node == null) {
            return;
        }

        way.add(node.val);
        if (node.left == null && node.right == null) {
            StringBuilder builder = new StringBuilder();
            for(Integer i: way){
                builder.append(builder.length() == 0 ? i.toString() : "->" + i);
            }
            paths.add(builder.toString());
        }

        binaryTreePathsRecursive(node.left, paths, way);
        if (node.left != null) {
            way.removeLast();
        }

        binaryTreePathsRecursive(node.right, paths, way);
        if (node.right != null) {
            way.removeLast();
        }
    }

}
