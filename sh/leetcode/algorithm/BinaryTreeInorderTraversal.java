package src.sh.leetcode.algorithm;

import src.sh.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(result, root);
        return result;
    }

    public static void inorder(List<Integer> result, TreeNode curNode) {
        if (curNode == null) return;
        inorder(result, curNode.left);
        result.add(curNode.val);
        inorder(result, curNode.right);
    }

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7)));
        rootNode.right = new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null));
        List<Integer> rs = inorderTraversal(rootNode);
        rs.forEach(System.out::println);
    }

}
