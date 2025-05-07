package src.sh.leetcode.algorithm.binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ls = new int[]{1, 2, 3, 4, 5};
        int target = 2;
        System.out.println(search(ls, target));
    }

    public static int search(int[] ls, int target) {
        int left = 0;
        int right = ls.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == ls[mid]) return mid;
            else if (target > ls[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
