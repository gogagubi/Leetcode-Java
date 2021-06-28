package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _21_MergeTwoSortedList {
    public static void main(String[] args) {
        if (true) {
            _21_MergeTwoSortedList c = new _21_MergeTwoSortedList();

            ListNode l1 = new ListNode(1, 2, 4);
            ListNode l2 = new ListNode(1, 3, 4);
            System.out.println("Merged list = " + c.mergeTwoLists(l1, l2).show());
        }

        if (true) {
            _21_MergeTwoSortedList c = new _21_MergeTwoSortedList();

            ListNode l1 = new ListNode(2);
            ListNode l2 = new ListNode(1);
            System.out.println("Merged list = " + c.mergeTwoLists(l1, l2).show());
        }
    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode tmp = root;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }

            tmp = tmp.next;
        }

        while (l1 != null) {
            tmp.next = l1;
            tmp = tmp.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            tmp.next = l2;
            tmp = tmp.next;
            l2 = l2.next;
        }

        return root.next;
    }


}
