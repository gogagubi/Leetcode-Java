package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _203_RemoveLinkedListElements {
    public static void main(String[] args) {
        if (true) {
            _203_RemoveLinkedListElements c = new _203_RemoveLinkedListElements();

            ListNode head = new ListNode(1, 2, 6, 3, 4, 5, 6);
            int val = 6;
            ListNode res = c.removeElements(head, val);
            System.out.println("Processed list = " + (res != null ? res.show() : "[]"));
        }

        if (true) {
            _203_RemoveLinkedListElements c = new _203_RemoveLinkedListElements();

            ListNode head = new ListNode(1);
            int val = 1;
            ListNode res = c.removeElements(head, val);
            System.out.println("Processed list = " + (res != null ? res.show() : "[]"));
        }
    }


    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode root = new ListNode(0);
        root.next = head;
        ListNode tmp = root;

        while (tmp.next != null) {
            if (tmp.next.val == val) {
                tmp.next = tmp.next.next;
            }
            else {
                tmp = tmp.next;
            }
        }

        return root.next;
    }


}
