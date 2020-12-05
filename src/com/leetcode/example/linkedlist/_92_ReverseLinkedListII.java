package com.leetcode.example.linkedlist;

import com.leetcode.statics.model.ListNode;

public class _92_ReverseLinkedListII {
    public static void main(String[] args) {
        if (true) {
            _92_ReverseLinkedListII s = new _92_ReverseLinkedListII();
            ListNode head = new ListNode(1, 2, 3, 4, 5);
            int m = 2;
            int n = 4;
            System.out.println(s.reverseBetween(head, m, n).show());
        }

        if (true) {
            _92_ReverseLinkedListII s = new _92_ReverseLinkedListII();
            ListNode head = new ListNode(5);
            int m = 1;
            int n = 1;
            System.out.println(s.reverseBetween(head, m, n).show());
        }

        if (true) {
            _92_ReverseLinkedListII s = new _92_ReverseLinkedListII();
            ListNode head = new ListNode(1, 2, 3);
            int m = 3;
            int n = 3;
            System.out.println(s.reverseBetween(head, m, n).show());
        }

        if (true) {
            _92_ReverseLinkedListII s = new _92_ReverseLinkedListII();
            ListNode head = new ListNode(1, 2, 3, 4, 5);
            int m = 3;
            int n = 4;
            System.out.println(s.reverseBetween(head, m, n).show());
        }

        if (true) {
            _92_ReverseLinkedListII s = new _92_ReverseLinkedListII();
            ListNode head = new ListNode(3, 5);
            int m = 1;
            int n = 2;
            System.out.println(s.reverseBetween(head, m, n).show());
        }
    }


    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode cur = head, before = null;

        for (int i = 0; i < m - 1; i++) {
            before = cur;
            cur = cur.next;
        }

        ListNode storedCurrent = cur;
        ListNode stored = null;
        while (n >= m) {
            ListNode next = cur.next;
            cur.next = stored;
            stored = cur;
            cur = next;
            n--;
        }

        storedCurrent.next = cur;
        if (before != null) before.next = stored;
        else head = stored;

        return head;
    }
}

