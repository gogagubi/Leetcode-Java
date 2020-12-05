package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _19_RemoveNthNodeFromEndList {
    public static void main(String[] args) {
        if (false) {
            _19_RemoveNthNodeFromEndList c = new _19_RemoveNthNodeFromEndList();

            ListNode node = new ListNode(1, 2, 3, 4, 5);
            int n = 2;
            ListNode result = c.removeNthFromEnd(node, n);
            System.out.println("Addition list = " + result != null ? result.show() : null);
        }

        if (true) {
            _19_RemoveNthNodeFromEndList c = new _19_RemoveNthNodeFromEndList();

            ListNode node = new ListNode(1);
            int n = 1;
            ListNode result = c.removeNthFromEnd(node, n);
            System.out.println("Addition list = " + (result != null ? result.show() : null));
        }

        if (false) {
            _19_RemoveNthNodeFromEndList c = new _19_RemoveNthNodeFromEndList();

            ListNode node = new ListNode(1, 2);
            int n = 2;
            ListNode result = c.removeNthFromEnd(node, n);
            System.out.println("Addition list = " + (result != null ? result.show() : null));
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) {
            return head;
        }

        ListNode container = new ListNode(0);
        container.next = head;

        ListNode ruller = container;
        for (int i = 0; i <= n; i++) {
            ruller = ruller.next;
        }

        ListNode tmp = container;
        while (ruller != null) {
            ruller = ruller.next;
            tmp = tmp.next;
        }

        tmp.next = tmp.next.next;
        return container.next;
    }
}
