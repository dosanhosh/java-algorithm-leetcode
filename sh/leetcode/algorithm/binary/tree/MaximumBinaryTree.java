package src.sh.leetcode.algorithm.binary.tree;

import src.sh.utils.ListNode;
import src.sh.utils.TreeNode;

public class MaximumBinaryTree {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    public static TreeNode construct(int[] nums, int start, int end) {
        if (start > end) return null;
        int max = -1;
        int idx = -1;

        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }
        TreeNode treeNode = new TreeNode(max);
        treeNode.left = construct(nums, start, idx - 1);
        treeNode.right = construct(nums, idx + 1, end);
        return treeNode;
    }

    public static void main(String[] args) {
        TreeNode treeNode = constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 4, 0});
        System.out.println("kq");
        printTree(treeNode);
    }

    public static void printTree(TreeNode node) {
        if (node == null) return;
        System.out.println(node.val);
        printTree(node.left);
        printTree(node.right);
    }
}
