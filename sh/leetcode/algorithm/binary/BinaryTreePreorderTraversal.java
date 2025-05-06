package src.sh.leetcode.algorithm.binary;

import src.sh.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        if (root == null) return rs;
//        rs.add(root.val);
        printBinaryTree(rs, root);
        return rs;
    }
    public static void printBinaryTree(List<Integer> rs, TreeNode node) {
        if (node == null) return;
        rs.add(node.val);
        printBinaryTree(rs, node.left);
        printBinaryTree(rs, node.right);
    }

//    public static void printBinaryTree(List<Integer> rs, TreeNode node) {
//        if (node == null) return;
//        if (node.left != null || node.right != null) {
//            if (node.left != null)
//                rs.add(node.left.val);
//            if (node.right != null)
//                rs.add(node.right.val);
//            printBinaryTree(rs, node.left);
//            printBinaryTree(rs, node.right);
//        }
//    }

    public static void main(String[] args) {
        TreeNode nodeLeft = new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7)));
        TreeNode nodeRight = new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null));
        TreeNode node = new TreeNode(1, nodeLeft, nodeRight);
        preorderTraversal(node).forEach(System.out::println);
    }
}
