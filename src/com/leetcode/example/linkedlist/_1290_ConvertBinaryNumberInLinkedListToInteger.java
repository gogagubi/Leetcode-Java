package com.leetcode.example.linkedlist;

import com.leetcode.statics.model.ListNode;

public class _1290_ConvertBinaryNumberInLinkedListToInteger {
    public static void main(String[] args) {
        if (true) {
            _1290_ConvertBinaryNumberInLinkedListToInteger c = new _1290_ConvertBinaryNumberInLinkedListToInteger();

            ListNode listNode = new ListNode(1, 0, 1);
            System.out.println("Integer = " + c.getDecimalValue(listNode));
        }

        if (true) {
            _1290_ConvertBinaryNumberInLinkedListToInteger c = new _1290_ConvertBinaryNumberInLinkedListToInteger();

            ListNode listNode = new ListNode(1, 1, 0, 1);
            System.out.println("Integer = " + c.getDecimalValue(listNode));
        }
    }

    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        StringBuilder builder = new StringBuilder();
        int result = 0, power = 0;

        while (curr != null) {
            builder.append(curr.val);
            curr = curr.next;
        }

        for (int i = builder.length() - 1; i >= 0; i--) {
            result += (builder.charAt(i) - '0') * Math.pow(2, power++);
        }

        return result;
    }

}
