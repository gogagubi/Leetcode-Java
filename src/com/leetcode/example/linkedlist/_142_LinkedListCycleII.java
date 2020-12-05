package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _142_LinkedListCycleII {
    public static void main(String[] args) {
        if (false) {
            _142_LinkedListCycleII c = new _142_LinkedListCycleII();

            ListNode listNode = new ListNode(3, 2, 0, 4);
            listNode.next.next.next.next = listNode.next;

            System.out.println(c.detectCycle(listNode).val);
        }

        if (false) {
            _142_LinkedListCycleII c = new _142_LinkedListCycleII();

            ListNode listNode = new ListNode(0, 1);
            listNode.next.next = listNode;

            System.out.println(c.detectCycle(listNode).val);
        }

        if (false) {
            _142_LinkedListCycleII c = new _142_LinkedListCycleII();

            ListNode listNode = new ListNode(3, 2, 0, 4, 7, 6, 5);
            listNode.addLast(listNode.next.next.next);

            System.out.println(c.detectCycle(listNode).val);
        }

        if (true) {
            _142_LinkedListCycleII c = new _142_LinkedListCycleII();

            ListNode listNode = new ListNode(3, 2, 0, 4, 7, 6, 5);
            listNode.addLast(listNode.next.next.next);

            System.out.println(c.detectCycle(listNode).val);
        }

    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast, slow, match;
        fast = slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                match = head;
                while (match != slow) {
                    slow = slow.next;
                    match = match.next;
                }

                return slow;
            }
        }

        return null;
    }

}
