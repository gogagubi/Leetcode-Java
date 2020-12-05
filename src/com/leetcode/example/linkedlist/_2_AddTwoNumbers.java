package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _2_AddTwoNumbers {
    public static void main(String[] args) {
        if (true) {
            _2_AddTwoNumbers c = new _2_AddTwoNumbers();

            ListNode l1 = new ListNode(2, 4, 3);
            ListNode l2 = new ListNode(5, 6, 9);

            System.out.println(new ListNode(2, 4, 3).show());
            System.out.println(new ListNode(5, 6, 9).show());
            System.out.println("Addition list = " + c.addTwoNumbers(l1, l2).show());
        }

        if (false) {
            _2_AddTwoNumbers c = new _2_AddTwoNumbers();

            ListNode l1 = new ListNode(1, 8);
            ListNode l2 = new ListNode(0);

            System.out.println("Addition list = " + c.addTwoNumbers(l1, l2).show());
        }

        if (false) {
            _2_AddTwoNumbers c = new _2_AddTwoNumbers();

            ListNode l1 = new ListNode(5);
            ListNode l2 = new ListNode(5);

            System.out.println("Addition list = " + c.addTwoNumbers(l1, l2).show());
        }

        if (false) {
            _2_AddTwoNumbers c = new _2_AddTwoNumbers();

            ListNode l1 = new ListNode(9);
            ListNode l2 = new ListNode(1, 9, 9, 9, 9, 9, 9, 9, 9);

            System.out.println("Addition list = " + c.addTwoNumbers(l1, l2).show());
        }

        if (false) {
            _2_AddTwoNumbers c = new _2_AddTwoNumbers();

            ListNode l1 = new ListNode(0, 8, 6, 5, 6, 8, 3, 5, 7);
            ListNode l2 = new ListNode(6, 7, 8, 0, 8, 5, 8, 9, 7);

            System.out.println("Addition list = " + c.addTwoNumbers(l1, l2).show());
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode result = node;

        int reminder = 0;
        while (node != null) {
            int calc = 0;

            if (l1 != null) {
                calc += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                calc += l2.val;
                l2 = l2.next;
            }

            calc += reminder;
            node.val = calc % 10;
            reminder = calc / 10;

            if (l1 != null || l2 != null || reminder > 0) {
                node.next = new ListNode(-1);
                node = node.next;
            } else {
                node = null;
            }
        }

        return result;
    }


}
