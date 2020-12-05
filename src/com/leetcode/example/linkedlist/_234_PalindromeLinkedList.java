package com.leetcode.example.linkedlist;

import com.leetcode.statics.model.ListNode;

public class _234_PalindromeLinkedList {
    public static void main(String[] args) {
        _234_PalindromeLinkedList s = new _234_PalindromeLinkedList();
        s.start();
    }

    public void start() {
        //example 1
        if (true) {
            _234_PalindromeLinkedList c = new _234_PalindromeLinkedList();
            ListNode listNode = new ListNode(1, 2, 3, 2, 1);

            System.out.println("isPalindrome = " + this.isPalindrome(listNode));
        }
    }


    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }


        slow = reverseList(slow);
        fast = head;
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode stored = null;
        while (head != null) {
            ListNode newHead = head.next;
            head.next = stored;
            stored = head;
            head = newHead;
        }

        return stored;
    }

}

