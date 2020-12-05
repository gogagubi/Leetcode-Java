package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _2_AddTwoNumbers_OLD {
    public static void main(String[] args) {
        if (false) {
            _2_AddTwoNumbers_OLD c = new _2_AddTwoNumbers_OLD();

            ListNode l1 = new ListNode(2, 4, 3);
            ListNode l2 = new ListNode(5, 6, 4);

            System.out.println("Addition list = " + c.addTwoNumbers(l1, l2).show());
        }

        if (false) {
            _2_AddTwoNumbers_OLD c = new _2_AddTwoNumbers_OLD();

            ListNode l1 = new ListNode(1, 8);
            ListNode l2 = new ListNode(0);

            System.out.println("Addition list = " + c.addTwoNumbers(l1, l2).show());
        }

        if (false) {
            _2_AddTwoNumbers_OLD c = new _2_AddTwoNumbers_OLD();

            ListNode l1 = new ListNode(5);
            ListNode l2 = new ListNode(5);

            System.out.println("Addition list = " + c.addTwoNumbers(l1, l2).show());
        }

        if (false) {
            _2_AddTwoNumbers_OLD c = new _2_AddTwoNumbers_OLD();

            ListNode l1 = new ListNode(9);
            ListNode l2 = new ListNode(1, 9, 9, 9, 9, 9, 9, 9, 9, 9);

            System.out.println("Addition list = " + c.addTwoNumbers(l1, l2).show());
        }


        if (true) {
            _2_AddTwoNumbers_OLD c = new _2_AddTwoNumbers_OLD();

            ListNode l1 = new ListNode(0, 8, 6, 5, 6, 8, 3, 5, 7);
            ListNode l2 = new ListNode(6, 7, 8, 0, 8, 5, 8, 9, 7);

            System.out.println("Addition list = " + c.addTwoNumbers(l1, l2).show());
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result;

        String num1 = getNumber(l1, true);
        String num2 = getNumber(l2, true);

        String sum = addNumbers(num1, num2, true);
        ListNode node = new ListNode(0);
        result = node;
        for (int i = 0; i < sum.length(); i++) {
            node.val = sum.charAt(i) - '0';

            if (i != sum.length() - 1) {
                node.next = new ListNode(0);
                node = node.next;
            }
        }

        return result;
    }

    public String getNumber(ListNode node, boolean reversed) {
        StringBuilder builder = new StringBuilder();
        ListNode tmp = node;
        while (tmp != null) {
            builder.append((char) (tmp.val + '0'));
            tmp = tmp.next;
        }

        if (reversed) {
            return builder.reverse().toString();
        }

        return builder.toString();
    }

    public String addNumbers(String num1, String num2, boolean reversed) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder result = new StringBuilder();
        int reminder = 0;

        while (i >= 0 || j >= 0 || reminder > 0) {
            int calc = 0;

            if (i >= 0) {
                calc += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                calc += num2.charAt(j) - '0';
                j--;
            }

            calc += reminder;

            result.insert(0, (char) ((calc % 10) + '0'));
            reminder = calc / 10;
        }

        if (reversed) {
            return result.reverse().toString();
        }

        return result.toString();
    }

}
