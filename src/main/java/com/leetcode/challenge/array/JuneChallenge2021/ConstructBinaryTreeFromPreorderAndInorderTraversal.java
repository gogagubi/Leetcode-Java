package com.leetcode.challenge.array.JuneChallenge2021;

import com.leetcode.statics.model.TreeNode;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public static void main(String[] args) {
        //example 1
        if (true) {
            ConstructBinaryTreeFromPreorderAndInorderTraversal c = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
            int[] preorder = {3, 9, 20, 15, 7};
            int[] inorder = {9, 3, 15, 20, 7};

            TreeNode res = c.buildTree(preorder, inorder);
            System.out.println(res.show());
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode node = new TreeNode();


        return node;
    }

}
