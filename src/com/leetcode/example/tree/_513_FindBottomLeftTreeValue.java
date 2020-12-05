package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class _513_FindBottomLeftTreeValue {
    public static void main(String[] args) {
        _513_FindBottomLeftTreeValue c = new _513_FindBottomLeftTreeValue();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _513_FindBottomLeftTreeValue c = new _513_FindBottomLeftTreeValue();

            TreeNode root = new TreeNode(2);
            root.left = new TreeNode(1);
            root.right = new TreeNode(3);

            System.out.println("Bottom left most element = " + c.findBottomLeftValue(root));
        }

        if (true) {
            _513_FindBottomLeftTreeValue c = new _513_FindBottomLeftTreeValue();

            TreeNode root = new TreeNode(2);
            root.left = new TreeNode(1, new TreeNode(4), null);
            root.right = new TreeNode(3, new TreeNode(5), new TreeNode(6));

            root.right.left.left = new TreeNode(7);

            System.out.println("Bottom left most element = " + c.findBottomLeftValue(root));
        }
    }

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();

            if (root.right != null) {
                queue.add(root.right);
            }

            if (root.left != null) {
                queue.add(root.left);
            }
        }

        return root.val;
    }


}
