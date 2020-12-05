package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _141_LinkedListCycle {
    public static void main(String[] args) {
        if (true) {
            _141_LinkedListCycle c = new _141_LinkedListCycle();

            ListNode listNode = new ListNode(3, 2, 0, 4);
            listNode.next.next.next.next = listNode.next;

            System.out.println(c.hasCycle(listNode));
        }


    }

    public boolean hasCycle(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

}
