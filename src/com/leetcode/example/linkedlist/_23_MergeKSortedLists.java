package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

import java.util.Arrays;

public class _23_MergeKSortedLists {
    public static void main(String[] args) {
        if (true) {
            _23_MergeKSortedLists c = new _23_MergeKSortedLists();

            ListNode l1 = new ListNode(1, 4, 5);
            ListNode l2 = new ListNode(1, 3, 4);
            ListNode l3 = new ListNode(2, 6);
            ListNode[] lists = new ListNode[3];
            lists[0] = l1;
            lists[1] = l2;
            lists[2] = l3;
            System.out.println("Merged list " + c.mergeKLists(lists).show());
        }

        if (true) {
            _23_MergeKSortedLists c = new _23_MergeKSortedLists();

            ListNode l1 = new ListNode(1, 4, 5);
            ListNode l2 = new ListNode(1);
            ListNode[] lists = new ListNode[3];
            lists[0] = l1;
            lists[1] = l2;
            System.out.println("Merged list " + c.mergeKLists(lists).show());
        }
    }


    public ListNode mergeKLists(ListNode[] lists) {
        ListNode root = new ListNode(0);
        ListNode tmp = root;
        int minIndex;

        minIndex = 0;
        while (minIndex != -1) {
            minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (minIndex == -1 || lists[i].val < lists[minIndex].val) {
                        minIndex = i;
                    }
                }
            }

            if (minIndex >= 0) {
                tmp.next = lists[minIndex];
                tmp = tmp.next;

                lists[minIndex] = lists[minIndex].next;
            }
        }

        return root.next;
    }


}
