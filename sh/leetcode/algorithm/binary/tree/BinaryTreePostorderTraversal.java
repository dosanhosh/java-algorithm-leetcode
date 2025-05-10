package src.sh.leetcode.algorithm.binary.tree;

import src.sh.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        if (root == null) return rs;
        postorderBinaryTree(rs, root);
        return rs;
    }

    public static void postorderBinaryTree(List<Integer> rs, TreeNode node) {
        if (node == null) return;
        postorderBinaryTree(rs, node.left);
        postorderBinaryTree(rs, node.right);
        rs.add(node.val);
    }

    public static void main(String[] args) {
        TreeNode nodeLeft = new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7)));
        TreeNode nodeRight = new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null));
        TreeNode node = new TreeNode(1, nodeLeft, nodeRight);
        postorderTraversal(node).forEach(System.out::println);
    }
}
