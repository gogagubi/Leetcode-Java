package com.leetcode.challenge.array.JuneChallenge2021;

import com.leetcode.statics.model.ListNode;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

//2021-06-23
public class ReverseLinkedListII {

    @Test
    public void testCase1() {
        ReverseLinkedListII c = new ReverseLinkedListII();
        ListNode head = new ListNode(1, 2, 3, 4, 5);
        int left = 2;
        int right = 4;

        assertEquals(new ListNode(1, 4, 3, 2, 5).show(), c.reverseBetween(head, left, right).show());
    }

    @Test
    public void testCase2() {
        ReverseLinkedListII c = new ReverseLinkedListII();
        ListNode head = new ListNode(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int left = 3;
        int right = 7;

        assertEquals(new ListNode(1, 2, 7, 6, 5, 4, 3, 8, 9).show(), c.reverseBetween(head, left, right).show());
    }

    @Test
    public void testCase3() {
        ReverseLinkedListII c = new ReverseLinkedListII();
        ListNode head = new ListNode(5);
        int left = 1;
        int right = 1;

        assertEquals(new ListNode(5).show(), c.reverseBetween(head, left, right).show());
    }

    @Test
    public void testCase4() {
        ReverseLinkedListII c = new ReverseLinkedListII();
        ListNode head = new ListNode(1, 2, 3, 4, 5);
        int left = 3;
        int right = 4;

        assertEquals(new ListNode(1, 2, 4, 3, 5).show(), c.reverseBetween(head, left, right).show());
    }

    @Test
    public void testCase5() {
        ReverseLinkedListII c = new ReverseLinkedListII();
        ListNode head = new ListNode(3, 5);
        int left = 1;
        int right = 2;

        assertEquals(new ListNode(5, 3).show(), c.reverseBetween(head, left, right).show());
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode node = root;

        int i = 0;
        while (node.next != null && i + 1 != left) {
            node = node.next;
            i++;
        }

        ListNode leftPart = node;
        ListNode rightPart = node.next;

        node = node.next;
        i++;

        ListNode reversed = null;
        while (node != null) {
            ListNode tmp = node;

            node = node.next;

            tmp.next = reversed;
            reversed = tmp;

            if (right == i++) break;
        }

        leftPart.next = reversed;
        if (rightPart != null) rightPart.next = node;

        return root.next;
    }
}
