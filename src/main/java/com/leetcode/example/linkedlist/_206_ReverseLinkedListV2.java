package com.leetcode.example.linkedlist;

import com.leetcode.statics.model.ListNode;

public class _206_ReverseLinkedListV2 {
    public static void main(String[] args) {
        _206_ReverseLinkedListV2 s = new _206_ReverseLinkedListV2();
        s.start();
    }

    public void start() {
        //example 1
        if (true) {
            _206_ReverseLinkedListV2 c = new _206_ReverseLinkedListV2();
            ListNode listNode = new ListNode(43, 12, 5, 2, 24);

            System.out.println("Reversed list = " + c.reverseList(listNode).show());
        }
    }

    ListNode result = null;

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        reverseListRec(head);
        return result;
    }

    public ListNode reverseListRec(ListNode root) {
        if (root.next == null) {
            return root;
        }

        ListNode tmp = reverseListRec(root.next);
        root.next = null;
        tmp.next = root;

        if (result == null) {
            result = tmp;
        }

        return tmp.next;
    }

}

