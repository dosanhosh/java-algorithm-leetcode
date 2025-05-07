package src.sh.leetcode.algorithm;

public class Test {
    public static void main(String[] args) {
        int[] ls = new int[]{1, 2, 3, 4, 5, 6};

        int i = 0;
        int j = 0;
        while (j < ls.length - 1) {
            i = i + 1;
            j = j + 2;
        }
        System.out.println(ls[i]);
    }
}
