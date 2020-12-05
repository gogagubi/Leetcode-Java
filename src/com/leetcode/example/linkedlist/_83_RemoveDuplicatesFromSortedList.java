package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _83_RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        if (true) {
            _83_RemoveDuplicatesFromSortedList c = new _83_RemoveDuplicatesFromSortedList();

            ListNode head = new ListNode(1, 1, 2);
            ListNode res = c.deleteDuplicates(head);
            System.out.println("Processed list = " + (res != null ? res.show() : "[]"));
        }

        if (true) {
            _83_RemoveDuplicatesFromSortedList c = new _83_RemoveDuplicatesFromSortedList();

            ListNode head = new ListNode(1, 1, 2, 3, 3);
            ListNode res = c.deleteDuplicates(head);
            System.out.println("Processed list = " + (res != null ? res.show() : "[]"));
        }

        if (true) {
            _83_RemoveDuplicatesFromSortedList c = new _83_RemoveDuplicatesFromSortedList();

            ListNode head = new ListNode(1);
            ListNode res = c.deleteDuplicates(head);
            System.out.println("Processed list = " + (res != null ? res.show() : "[]"));
        }
    }


    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode tmp = head;
        while (tmp != null && tmp.next != null) {
            while (tmp.next != null && tmp.val == tmp.next.val) {
                tmp.next = tmp.next.next;
            }

            tmp = tmp.next;
        }

        return head;
    }


}
