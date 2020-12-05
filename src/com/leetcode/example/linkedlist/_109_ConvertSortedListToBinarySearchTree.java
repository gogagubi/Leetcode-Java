package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;
import com.leetcode.statics.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _109_ConvertSortedListToBinarySearchTree {
    public static void main(String[] args) {
        if (true) {
            _109_ConvertSortedListToBinarySearchTree c = new _109_ConvertSortedListToBinarySearchTree();

            ListNode listNode = new ListNode(-10, -3, 0, 5, 9);
            System.out.println("Tree result \n" + c.sortedListToBST(listNode).show());
        }

    }

    public TreeNode sortedListToBST(ListNode head) {
        TreeNode node = null;
        if (head == null) {
            return node;
        }


        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        node = sortedListToBST(list, 0, list.size() - 1);
        return node;
    }

    public TreeNode sortedListToBST(List<Integer> list, int from, int to) {
        if (from > to) {
            return null;
        }

        int middle = (from + to) / 2;
        TreeNode node = new TreeNode(list.get(middle));
        node.left = sortedListToBST(list, from, middle - 1);
        node.right = sortedListToBST(list, middle + 1, to);

        return node;
    }


}
