package com.leetcode.example.linkedlist;

import com.leetcode.statics.model.ListNode;

public class _206_ReverseLinkedList {
    public static void main(String[] args) {
        _206_ReverseLinkedList s = new _206_ReverseLinkedList();
        s.start();
    }

    public void start() {
        //example 1
        if (true) {
            _206_ReverseLinkedList c = new _206_ReverseLinkedList();
            ListNode listNode = new ListNode(43, 12, 5, 2, 24);

            System.out.println("Reversed list = " + c.reverseList(listNode).show());
        }
    }


    public ListNode reverseList(ListNode head) {
        ListNode stored = null;

        while (head != null) {
            ListNode newHead = head.next;
            head.next = stored;
            stored = head;
            head = newHead;
        }

        return stored;
    }
}

