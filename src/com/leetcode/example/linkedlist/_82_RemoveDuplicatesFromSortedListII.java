package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _82_RemoveDuplicatesFromSortedListII {
    public static void main(String[] args) {
        if (false) {
            _82_RemoveDuplicatesFromSortedListII c = new _82_RemoveDuplicatesFromSortedListII();

            ListNode head = new ListNode(1, 2, 3, 3, 4, 4, 5);
            ListNode res = c.deleteDuplicates(head);
            System.out.println("After duplicates removed = " + (res != null ? res.show() : "[]"));
        }

        if (false) {
            _82_RemoveDuplicatesFromSortedListII c = new _82_RemoveDuplicatesFromSortedListII();

            ListNode head = new ListNode(1, 1, 1, 2, 3);
            ListNode res = c.deleteDuplicates(head);
            System.out.println("After duplicates removed = " + (res != null ? res.show() : "[]"));
        }

        if (false) {
            _82_RemoveDuplicatesFromSortedListII c = new _82_RemoveDuplicatesFromSortedListII();

            ListNode head = new ListNode(1);
            ListNode res = c.deleteDuplicates(head);
            System.out.println("After duplicates removed = " + (res != null ? res.show() : "[]"));
        }

        if (true) {
            _82_RemoveDuplicatesFromSortedListII c = new _82_RemoveDuplicatesFromSortedListII();

            ListNode head = new ListNode(0, 0, 0, 0);
            ListNode res = c.deleteDuplicates(head);
            System.out.println("After duplicates removed = " + (res != null ? res.show() : "[]"));
        }
    }


    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode tmp = root, inTmp;
        int counter = 0;

        while (tmp != null && tmp.next != null) {
            if (tmp.val != tmp.next.val) {
                inTmp = tmp.next;
                while (inTmp.next != null && inTmp.val == inTmp.next.val) {
                    inTmp.next = inTmp.next.next;
                    counter++;
                }

                if (counter > 0) {
                    tmp.next = inTmp.next;
                }
            }


            if (counter == 0) {
                tmp = tmp.next;
            }
            counter = 0;
        }

        return root.next;
    }


}
