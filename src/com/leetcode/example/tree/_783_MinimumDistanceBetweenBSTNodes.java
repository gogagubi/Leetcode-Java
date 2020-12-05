package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _783_MinimumDistanceBetweenBSTNodes {
    public static void main(String[] args) {
        _783_MinimumDistanceBetweenBSTNodes c = new _783_MinimumDistanceBetweenBSTNodes();

        if (false) {
            TreeNode root = new TreeNode(4, 2, 6, 1, 3, null, null);
            System.out.println("Result " + c.minDiffInBST(root));
        }

        if (true) {
            TreeNode root = new TreeNode(80, 77, 82, 75, 78);
            System.out.println("Result " + c.minDiffInBST(root));
        }
    }


    public int minDiffInBST(TreeNode root) {
        int result = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        readInOrder(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            result = Math.min(result, list.get(i + 1) - list.get(i));
        }

        return result;
    }


    public void readInOrder(TreeNode node, List<Integer> vals) {
        if (node == null) {
            return;
        }

        readInOrder(node.left, vals);
        vals.add(node.val);
        readInOrder(node.right, vals);
    }

}
