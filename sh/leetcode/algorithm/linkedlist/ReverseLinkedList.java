package src.sh.leetcode.algorithm.linkedlist;

import src.sh.utils.ListNode;

import java.util.List;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode node = null;
        while (head != null){
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;
    }

    // recursion
//    public static ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode newHead = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))));

        listNode = reverseList(listNode);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}
