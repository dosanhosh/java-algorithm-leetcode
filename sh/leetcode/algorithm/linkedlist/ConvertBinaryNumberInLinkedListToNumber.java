package src.sh.leetcode.algorithm.linkedlist;

import src.sh.utils.ListNode;

public class ConvertBinaryNumberInLinkedListToNumber {
//    public static int getDecimalValue(ListNode head) {
//        head = reverseLinkedList(head);
//        return convert(head, 0);
//    }

    /* sum = 0
     * 11101
     * sum =(sum * 2) + val
     * sum = 0 * 2 + 1 = 1
     * sum = 1 * 2  + 1 = 3
     * sum = 3 * 2  + 1 = 7
     * sum = 7 * 2  + 0 = 14
     * sum = 14 * 2  + 1 = 29
     *
     * */
    public static int getDecimalValue(ListNode head) {
        int sum = 0;

        while (head != null) {
            sum *= 2;
            sum += head.val;
            head = head.next;
        }
        return sum;
    }

    public static int convert(ListNode node, int idx) {
        if (node == null) return 0;
        return (int) (Math.pow(2, idx) * node.val) + convert(node.next, idx + 1);
    }

    public static ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode headNew = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return headNew;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(1,
                new ListNode(1, new ListNode(0, new ListNode(1)))));
        System.out.print(getDecimalValue(listNode));
    }
}
