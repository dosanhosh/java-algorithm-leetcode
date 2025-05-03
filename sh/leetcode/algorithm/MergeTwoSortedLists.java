package src.sh.leetcode.algorithm;

import src.sh.utils.ListNode;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode cur = result;

        while (list1 != null && list2 != null){
            if (list1.val > list2.val){
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }

        cur.next = list1 != null ? list1 : list2;
        return result.next;
    }


    public static void main(String[] args) {
//        ListNode l1 = new ListNode(5);
//
//        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
//
//        ListNode l3 = mergeTwoLists(l1, l2);


        ListNode l1 = new ListNode(-9, new ListNode(3));

        ListNode l2 = new ListNode(5, new ListNode(7));

        ListNode l3 = mergeTwoLists(l1, l2);

        while (l3 != null) {
            System.out.println(l3.val);
            if (l3 != null) l3 = l3.next;
        }
    }

}
