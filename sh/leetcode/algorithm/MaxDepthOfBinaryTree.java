package src.sh.leetcode.algorithm;

import src.sh.utils.TreeNode;

import javax.swing.text.html.ListView;
import java.util.ArrayList;
import java.util.List;

public class MaxDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }



    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(1);
        rootNode.left = new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7)));
        rootNode.right = new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null));
        int max = maxDepth(rootNode);
        System.out.print(max);
    }
}
