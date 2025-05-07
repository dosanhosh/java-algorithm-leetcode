package src.sh.leetcode.algorithm.linkedlist;

import src.sh.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumLinkedList {

//    public static int pairSum(ListNode head) {
//        int max = 0;
//        ListNode cur = head;
//        while (head != null) {
//            while (cur != null) {
//                if (cur.next.next == null) break;
//                cur = cur.next;
//            }
//            int sum = head.val + cur.next.val;
//            if (sum > max) max = sum;
//
//            cur.next = null;
//            cur = head.next;
//            head = head.next;
//        }
//        return max;
//    }

    public static int pairSumOn(ListNode head) {
        int max = 0;
        List<Integer> lst = new ArrayList<>();
        while (head != null) {
            lst.add(head.val);
            head = head.next;
        }
        int size = lst.size();
        for (int i = 0; i < size / 2; i++) {
            max = Math.max(max, lst.get(i) + lst.get(size - i - 1));
        }
        return max;
    }

    // slow/fast find the middle
    public static int pairSum(ListNode head) {
        int max = 0;
        ListNode slow = head, fast = head;

        // slow, fast => find the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(slow);

        ListNode firstHalf = head;
        while (secondHalf != null){
            max = Math.max(max, firstHalf.val + secondHalf.val);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return max;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null, cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }


    public static void main(String[] args) {

//        ListNode listNode = new ListNode(1, new ListNode(10000));
        ListNode listNode = build(new int[]{1, 2, 3, 4, 5, 6});
//        ListNode listNode = build(new int[]{1,10000});
//        ListNode listNode = build(new int[]{47, 22, 81, 46, 94, 95, 90, 22, 55, 91, 6, 83, 49, 65, 10, 32, 41, 26, 83, 99, 14, 85, 42, 99, 89, 69, 30, 92, 32, 74, 9, 81, 5, 9});
        System.out.println(pairSum(listNode));

    }

    public static ListNode build(int[] lsVal) {
        ListNode rs = new ListNode(0);

        ListNode node = rs;
        for (int val : lsVal) {
            node.next = new ListNode(val);
            node = node.next;
        }
        return rs.next;
    }
}
