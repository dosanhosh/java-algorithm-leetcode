package src.sh.leetcode.algorithm.linkedlist;

import src.sh.utils.ListNode;

import java.util.List;

public class DeleteNodeASingleNode {
    // 2 3 4 5 6
    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) return;
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))));

        deleteNode(listNode.next);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
