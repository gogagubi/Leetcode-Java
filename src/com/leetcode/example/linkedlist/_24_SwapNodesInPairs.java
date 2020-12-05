package com.leetcode.example.linkedlist;

import com.leetcode.statics.model.ListNode;

public class _24_SwapNodesInPairs {
    public static void main(String[] args) {
        if (true) {
            _24_SwapNodesInPairs c = new _24_SwapNodesInPairs();

            ListNode listNode = new ListNode(1, 2, 3, 4);
            System.out.println("Result = " + c.swapPairs(listNode).show());
        }

        if (true) {
            _24_SwapNodesInPairs c = new _24_SwapNodesInPairs();

            ListNode listNode = new ListNode(1, 2);
            System.out.println("Result = " + c.swapPairs(listNode).show());
        }

        if (true) {
            _24_SwapNodesInPairs c = new _24_SwapNodesInPairs();

            ListNode listNode = new ListNode(1);
            System.out.println("Result = " + c.swapPairs(listNode).show());
        }

        if (true) {
            _24_SwapNodesInPairs c = new _24_SwapNodesInPairs();

            ListNode listNode = new ListNode(1, 2, 3);
            System.out.println("Result = " + c.swapPairs(listNode).show());
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode(0);
        root.next = head;

        ListNode prev = root;
        while (head != null && head.next != null) {
            ListNode tmp = head.next;
            head.next = head.next.next;
            tmp.next = head;
            prev.next = tmp;

            prev = head;
            head = head.next;
        }

        return root.next;
    }

}
