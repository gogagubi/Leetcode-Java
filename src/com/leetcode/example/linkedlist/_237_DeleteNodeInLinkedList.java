package com.leetcode.example.linkedlist;


import com.leetcode.statics.model.ListNode;

public class _237_DeleteNodeInLinkedList {
    public static void main(String[] args) {
        if (false) {
            _237_DeleteNodeInLinkedList c = new _237_DeleteNodeInLinkedList();

            ListNode node = new ListNode(4, 5, 1, 9);
            c.deleteNode(node.next);
            System.out.println("after deletion = " + node.show());
        }

        if (false) {
            _237_DeleteNodeInLinkedList c = new _237_DeleteNodeInLinkedList();

            ListNode node = new ListNode(4, 5, 1, 9);
            c.deleteNode(node.next.next);
            System.out.println("after deletion = " + node.show());
        }

        if (true) {
            _237_DeleteNodeInLinkedList c = new _237_DeleteNodeInLinkedList();

            ListNode node = new ListNode(4, 5, 1, 9);
            c.deleteNode(node.next.next.next);
            System.out.println("after deletion = " + node.show());
        }
    }


    public void deleteNode(ListNode node) {
        if(node == null || node.next == null){
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;
    }


}
