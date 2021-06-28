package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _1382_BalanceBinarySearchTree {
    public static void main(String[] args) {
        _1382_BalanceBinarySearchTree c = new _1382_BalanceBinarySearchTree();
        c.start();
    }

    public void start() {
        //example 1
        if (false) {
            _1382_BalanceBinarySearchTree c = new _1382_BalanceBinarySearchTree();

            Integer[] data = {1, null, 2, null, 3, null, 4, null, null};
            TreeNode root = new TreeNode(data);

            System.out.println("Balanced tree \n" + c.balanceBST(root).show());
        }

        if (false) {
            _1382_BalanceBinarySearchTree c = new _1382_BalanceBinarySearchTree();

            Integer[] data = {14, 9, 16, 2, 13};
            TreeNode root = new TreeNode(data);

            System.out.println("Balanced tree \n" + c.balanceBST(root).show());
        }

        if (true) {
            _1382_BalanceBinarySearchTree c = new _1382_BalanceBinarySearchTree();

            Integer[] data = {1, null, 15, 14, 17, 7, null, null, null, 2, 12, null, 3, 9, null, null, null, null, 11};
            TreeNode root = new TreeNode(data);

            System.out.println("Balanced tree \n" + c.balanceBST(root).show());
        }
    }

    public TreeNode balanceBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        List<TreeNode> list = new ArrayList<>();
        readIntoList(root, list);
        root = this.buildTree(list, 0, list.size() - 1);

        return root;
    }

    public void readIntoList(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }

        readIntoList(root.left, list);
        list.add(root);
        readIntoList(root.right, list);
        root.left = null;
        root.right = null;
    }

    public TreeNode buildTree(List<TreeNode> list, int from, int to) {
        if (from > to) {
            return null;
        }

        int middle = (to + from) / 2;
        TreeNode node = list.get(middle);
        node.left = buildTree(list, from, middle - 1);
        node.right = buildTree(list, middle + 1, to);
        return node;
    }


}
