package src.sh.leetcode.algorithm.linkedlist;

import src.sh.utils.ListNode;

import java.util.List;

// merge sort, two point, divide and conquer
public class SortList {
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        // find middle
        ListNode slow = head;
        ListNode fast = slow.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode mid = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    public static ListNode merge(ListNode left, ListNode right) {
        ListNode dumpy = new ListNode(0);
        ListNode rs = dumpy;
        while (left != null && right != null) {
            if (left.val < right.val) {
                rs.next = left;
                left = left.next;
            } else {
                rs.next = right;
                right = right.next;
            }
            rs = rs.next;
        }
        rs.next = right != null ? right : left;
        return dumpy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(2, new ListNode(1, new ListNode(3)));

        listNode = sortList(listNode);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
