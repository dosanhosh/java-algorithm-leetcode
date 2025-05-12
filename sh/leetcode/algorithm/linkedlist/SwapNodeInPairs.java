package src.sh.leetcode.algorithm.linkedlist;

import src.sh.utils.ListNode;

import java.util.List;

public class SwapNodeInPairs {

    public static ListNode swapPairs(ListNode head) {
        ListNode dumpy = new ListNode(0);
        dumpy.next = head;

        ListNode prev = dumpy.next;
        ListNode cur = dumpy;
        while (prev != null && prev.next != null) {
            ListNode temp = prev.next;
            prev.next = temp.next;
            temp.next = prev;


            cur.next = temp;
            prev = prev.next;
            cur = cur.next.next;
        }
        return dumpy.next;
    }

    // recursive
//    public static ListNode swapPairs(ListNode head) {
//        if (head == null || head.next == null) return head;
//
//        ListNode rs = head.next;
//        head.next = swapPairs(rs.next);
//        rs.next = head;
//        return rs;
//    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6)))));

        listNode = swapPairs(listNode);
        listNode.printLN();
    }
}
