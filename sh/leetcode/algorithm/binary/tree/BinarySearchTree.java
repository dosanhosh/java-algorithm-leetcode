//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package src.sh.leetcode.algorithm.binary.tree;

import src.sh.utils.TreeNode;

public class BinarySearchTree {
    public BinarySearchTree() {
    }

    public static boolean search(TreeNode node, int val) {
        if (node == null) {
            return false;
        } else if (val == node.val) {
            return true;
        } else {
            return node.val < val ? search(node.left, val) : search(node.right, val);
        }
    }

    public static void main(String[] args) {
        TreeNode nodeLeft = new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7)));
        TreeNode nodeRight = new TreeNode(3, (TreeNode)null, new TreeNode(8, new TreeNode(9), (TreeNode)null));
        TreeNode node = new TreeNode(1, nodeLeft, nodeRight);
        System.out.println(search(node, 8));
    }

    public static void printTree(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
            printTree(node.left);
            printTree(node.right);
        }
    }
}
