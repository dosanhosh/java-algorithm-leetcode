package src.sh.utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void printLN() {
        System.out.println(val);
        while (next != null) {
            System.out.println(next.val);
            next = next.next;
        }
    }
}
