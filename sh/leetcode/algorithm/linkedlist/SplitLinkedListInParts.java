package src.sh.leetcode.algorithm.linkedlist;

import src.sh.utils.ListNode;

import java.util.Arrays;

public class SplitLinkedListInParts {

    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] rs = new ListNode[k];

        int len = 0;
        ListNode node = head;
        while (node != null) {
            len++;
            node = node.next;
        }
        int r = len % k, n = len / k;

        node = head;
        ListNode prev = null;
        for (int i = 0; node != null && i < k; i++, r--) {
            rs[i] = node;

            for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) {
                prev = node;
                node = node.next;
            }
            if (prev != null) prev.next = null;
        }
        return rs;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7))))));

        ListNode[] list = splitListToParts(listNode, 3);

        Arrays.stream(list).forEach(e -> {
            System.out.println("----");
            e.printLN();
            System.out.println("----");
        });
    }
}
