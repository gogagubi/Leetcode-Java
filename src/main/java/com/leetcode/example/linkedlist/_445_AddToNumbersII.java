package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

import java.util.Stack;

public class _445_AddToNumbersII {
    public static void main(String[] args) {
        if (true) {
            _445_AddToNumbersII c = new _445_AddToNumbersII();

            ListNode l1 = new ListNode(7, 2, 4, 3);
            ListNode l2 = new ListNode(5, 6, 4);

            System.out.println("Addition result = " + c.addTwoNumbers(l1, l2).show());
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);

        Stack<Integer> l1Stack = new Stack<>();
        Stack<Integer> l2Stack = new Stack<>();

        ListNode node1 = l1;
        while (node1 != null) {
            l1Stack.add(node1.val);
            node1 = node1.next;
        }

        ListNode node2 = l2;
        while (node2 != null) {
            l2Stack.add(node2.val);
            node2 = node2.next;
        }

        int reminder = 0;
        while (!l1Stack.isEmpty() || !l2Stack.isEmpty() || reminder > 0) {
            int calc = 0;

            if (!l1Stack.isEmpty()) {
                calc += l1Stack.pop();
            }

            if (!l2Stack.isEmpty()) {
                calc += l2Stack.pop();
            }

            calc += reminder;
            result.val = calc % 10;
            reminder = calc / 10;

            ListNode parentNode = new ListNode(-1);
            parentNode.next = result;
            result = parentNode;
        }

        return result.next;
    }


}
