package src.sh.leetcode.algorithm;

import src.sh.utils.ListNode;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;


        while (list1 != null || list2 != null) {
            if (list1 == null) {
                if (curr.val < list2.val) {
                    curr.next = new ListNode(list2.val);
                } else {
                    int curVal = curr.val;
                    curr.val = list2.val;
                    curr.next = new ListNode(curVal);
                }
                curr = curr.next;
            } else if (list2 == null) {
                if (curr.val < list1.val) {
                    curr.next = new ListNode(list1.val);
                } else {
                    int curVal = curr.val;
                    curr.val = list1.val;
                    curr.next = new ListNode(curVal);
                }
                curr = curr.next;
            } else {
                int min = Math.min(list1.val, list2.val);
                int max = Math.max(list1.val, list2.val);
                if (curr.val > max) {

                } else if (curr.val > min) {

                }
                curr.next = new ListNode(min, new ListNode(max));
                curr = curr.next.next;

            }


            if (list1 != null) list1 = list1.next;
            if (list2 != null) list2 = list2.next;
        }

        return result.next;

    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(5);
//
//        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
//
//        ListNode l3 = mergeTwoLists(l1, l2);
//
//        while (l3 != null) {
//            System.out.println(l3.val);
//            if (l3 != null) l3 = l3.next;
//        }

        ListNode l1 = new ListNode(-9, new ListNode(3));

        ListNode l2 = new ListNode(5, new ListNode(7));

        ListNode l3 = mergeTwoLists(l1, l2);

        while (l3 != null) {
            System.out.println(l3.val);
            if (l3 != null) l3 = l3.next;
        }
    }

}
