package src.sh.leetcode.algorithm.linkedlist;

import src.sh.utils.ListNode;

import java.util.List;

public class ReverseLinkedListII {
    public static ListNode reverseBetween(ListNode head, int left, int right) {

        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2, new ListNode(3, new ListNode(4)));

        listNode = reverseBetween(listNode, 2, 3);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
