package src.sh.leetcode.algorithm.linkedlist;

import src.sh.utils.ListNode;

public class GreatestCommonDivisorInLinkedList {
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dumpy = new ListNode(0);
        dumpy.next = head;
        while (head.next != null) {
            int valGCD = GreatestCommonDivisor(head.val, head.next.val);

            ListNode temp = head.next;
            head.next = new ListNode(valGCD, temp);
            head = temp;
        }
        return dumpy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(18);
        listNode.next = new ListNode(6, new ListNode(10, new ListNode(3)));

        listNode = insertGreatestCommonDivisors(listNode);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    // algorithm Ơ-clit
//    public static int GreatestCommonDivisor(int a, int b) {
//        int max = Math.max(a, b);
//        int min = Math.min(a, b);
//        if (max % min == 0) return min;
//        return GreatestCommonDivisor(min, max % min);
//    }

    public static int GreatestCommonDivisor(int a, int b) {
        if (a % b == 0) return b;
        return GreatestCommonDivisor(b, a % b);
    }

}
