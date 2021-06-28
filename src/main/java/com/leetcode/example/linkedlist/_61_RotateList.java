package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _61_RotateList {
    public static void main(String[] args) {
        if (true) {
            _61_RotateList c = new _61_RotateList();

            ListNode listNode = new ListNode(1, 2, 3, 4, 5);
            int k = 2;
            System.out.println(c.rotateRight(listNode, k).show());
        }

        if (true) {
            _61_RotateList c = new _61_RotateList();

            ListNode listNode = new ListNode(0, 1, 2);
            int k = 4;
            System.out.println(c.rotateRight(listNode, k).show());
        }

        if (true) {
            _61_RotateList c = new _61_RotateList();

            ListNode listNode = new ListNode();
            int k = 1;
            System.out.println(c.rotateRight(listNode, k).show());
        }

        if (true) {
            _61_RotateList c = new _61_RotateList();

            ListNode listNode = new ListNode(1, 2, 3);
            int k = 2000000000;
            System.out.println(c.rotateRight(listNode, k).show());
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = 0;
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            length++;
        }

        if (k == length) {
            return head;
        }

        if (k > length) {
            k = k - (k / length * length);
        }

        while (k != 0) {
            ListNode beforeLastNode = null;
            ListNode lastNode = head;
            while (lastNode.next != null) {
                beforeLastNode = lastNode;
                lastNode = lastNode.next;
            }

            if (beforeLastNode != null) {
                beforeLastNode.next = null;
            }
            lastNode.next = head;
            head = lastNode;
            k--;
        }

        return head;
    }

}
