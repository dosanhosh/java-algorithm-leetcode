package src.sh.leetcode.algorithm;

import src.sh.utils.ListNode;

public class AddTwoNumbers {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        ListNode result = new ListNode();
//        int index = 0;
//        boolean flag = true;
//        int remainder = 0;
//        do {
//            int total = 0;
//            if (l1.next == null && l2.next == null) {
//                flag = false;
//            }
//
//            total = l1.val + l2.val + remainder;
//            if (total >= 10) {
//                remainder = total / 10;
//                total = total % 10;
//            }
//
//
//            if (index == 0) result = new ListNode(total);
//            else result = new ListNode(total, result);
//            index++;
//
//            l1 = l1.next;
//            l2 = l2.next;
//        } while (flag);
//
//        return result;
//    }

    /*
    * result val = 0
    * curr = result
    * curr.next = 7 <=> result.next = 7
    *
    * curr = 7
    * curr.next = 0
    * curr = 0
    * curr.next = 8
    * */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {

            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode l3 = addTwoNumbers(l1, l2);

        System.out.println(l3.val);
        System.out.println(l3.next.val);
        System.out.println(l3.next.next.val);
    }
}
