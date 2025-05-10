package src.sh.leetcode.algorithm.binary.tree;

import java.util.Arrays;

public class UniqueBinarySearchTree {

    /*
     * n = 0 -> 1
     * n = 1 -> 1
     * n = 2 -> 2
     * n = 3 -> 5
     * n = 4 -> 14
     * CT: total += [root - 1] * [nodes - root]
     * [root - 1] => left
     * [nodes - root] => right
     * day so:1 2 3 4
     * b1: choose root = 1, index = 1
     * left = 0, right = 3 => total = 1 * 5 = 5
     * b2: choose root = 2, index = 2
     * left = 1, right = 2 => total = 1 * 2 = 2
     * b2: choose root = 3, index = 3
     * left = 2, right = 1 => total = 2 * 1 = 2
     * b1: choose root = 4, index = 4
     * left = 3, right = 0 => total = 1 * 5 = 5
     * total += 5 + 2 + 2 + 5 =  14
     * */
    public static int numTrees(int n) {
        int[] uni = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            uni[i] = 1;
        }

        for (int nodes = 1; nodes <= n; nodes++) {
            int total = 0;
            for (int root = 1; root <= nodes; root++) {
                total += uni[root - 1] * uni[nodes - root];
            }
            uni[nodes] = total;
        }

        return uni[n];
    }

    public static void main(String[] args) {
        System.out.println(numTrees(4));
    }
}
