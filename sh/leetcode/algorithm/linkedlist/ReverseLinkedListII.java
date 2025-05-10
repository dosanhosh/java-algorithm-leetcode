package src.sh.leetcode.algorithm.linkedlist;

import src.sh.utils.ListNode;

import java.util.List;

public class ReverseLinkedListII {
    // farmer
//    public static ListNode reverseBetween(ListNode head, int left, int right) {
//        if (head == null || left == right) return head;
//        ListNode dump = new ListNode();
//        dump.next = head;
//
//        ListNode prev = dump;
//        for (int i = 0; i < left - 1; i++) {
//            prev = prev.next;
//        }
//
//        ListNode node = null;
//        ListNode leftSite = null;
//        int idx = 1;
//        while (head != null) {
//            if (idx > right) {
//                leftSite.next = head;
//                leftSite = leftSite.next;
//            }
//            if (idx >= left && idx <= right) {
//                if (idx == left) leftSite = head;
//                ListNode temp = head.next;
//                head.next = node;
//                node = head;
//                head = temp;
//                idx++;
//                continue;
//            }
//            head = head.next;
//            idx++;
//        }
//        prev.next = node;
//        return dump.next;
//    }


    // worker
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dumpy = new ListNode(0);
        dumpy.next = head;

        // node ngay truoc left
        ListNode prev = dumpy;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // node = left
        ListNode cur = prev.next;
        // 1 2 3 4 5 6
        // 1 3 2 4 5 6
        // 1 4 3 2 5 6
        // 1 5 4 3 2 6
        for (int i = 0; i < right - left; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        return dumpy.next;
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))));

        listNode = reverseBetween(listNode, 2, 5);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
