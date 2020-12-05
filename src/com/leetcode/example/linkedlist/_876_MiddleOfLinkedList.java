package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _876_MiddleOfLinkedList {
    public static void main(String[] args) {
        if (true) {
            _876_MiddleOfLinkedList c = new _876_MiddleOfLinkedList();

            ListNode head = new ListNode(1, 2, 3, 4, 5);
            System.out.println("Middle of list " + c.middleNode(head).show());
        }

        if (true) {
            _876_MiddleOfLinkedList c = new _876_MiddleOfLinkedList();

            ListNode head = new ListNode(1, 2, 3, 4, 5, 6);
            System.out.println("Middle of list " + c.middleNode(head).show());
        }
    }


    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


}
