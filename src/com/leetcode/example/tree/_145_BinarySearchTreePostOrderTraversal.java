package com.leetcode.example.tree;

import com.leetcode.statics.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _145_BinarySearchTreePostOrderTraversal {
    public static void main(String[] args) {
        _145_BinarySearchTreePostOrderTraversal c = new _145_BinarySearchTreePostOrderTraversal();
        c.start();
    }

    public void start() {
        //example 1
        if (true) {
            _145_BinarySearchTreePostOrderTraversal c = new _145_BinarySearchTreePostOrderTraversal();

            TreeNode root = new TreeNode(1);
            root.right = new TreeNode(2, new TreeNode(3), null);


            System.out.println("Post order traversal " + c.postorderTraversal(root));
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        postorderTraversalRecursion(root, result);
        return result;
    }

    public void postorderTraversalRecursion(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        postorderTraversalRecursion(root.left, result);
        postorderTraversalRecursion(root.right, result);
        result.add(root.val);
    }

}
