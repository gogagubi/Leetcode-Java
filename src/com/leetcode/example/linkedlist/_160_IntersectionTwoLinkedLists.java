package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _160_IntersectionTwoLinkedLists {
    public static void main(String[] args) {
        if (true) {
            _160_IntersectionTwoLinkedLists c = new _160_IntersectionTwoLinkedLists();

            ListNode common = new ListNode(8, 4, 5);
            ListNode listNode1 = new ListNode(4, 1);
            listNode1.addLast(common);
            ListNode listNode2 = new ListNode(5, 0, 1);
            listNode2.addLast(common);

            System.out.println("Intersection: " + c.getIntersectionNode(listNode1, listNode2));
        }

        if (true) {
            _160_IntersectionTwoLinkedLists c = new _160_IntersectionTwoLinkedLists();

            ListNode common = new ListNode(1);
            ListNode listNode1 = common;
            ListNode listNode2 = common;

            System.out.println("Intersection: " + c.getIntersectionNode(listNode1, listNode2));
        }

        if (true) {
            _160_IntersectionTwoLinkedLists c = new _160_IntersectionTwoLinkedLists();

            ListNode common = new ListNode(41, 42);
            ListNode listNode1 = new ListNode(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39);
            listNode1.addLast(common);
            ListNode listNode2 = new ListNode(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40);
            listNode2.addLast(common);

            System.out.println("Intersection: " + c.getIntersectionNode(listNode1, listNode2));
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmp1 = headA, tmp2 = headB, shorter = null, longer = null;
        int counter = 0;

        while (tmp1 != null || tmp2 != null) {
            if (tmp1 == tmp2) {
                return tmp1;
            }

            if (tmp1 == null || tmp2 == null) {
                counter++;
                shorter = tmp1 == null ? headA : headB;
                longer = tmp1 != null ? headA : headB;
            }

            if (tmp1 != null) tmp1 = tmp1.next;
            if (tmp2 != null) tmp2 = tmp2.next;
        }

        while (shorter != null && longer != null) {
            while (counter-- > 0) {
                longer = longer.next;
            }

            if (shorter == longer) {
                return shorter;
            }

            longer = longer.next;
            shorter = shorter.next;
        }

        return null;
    }

}
