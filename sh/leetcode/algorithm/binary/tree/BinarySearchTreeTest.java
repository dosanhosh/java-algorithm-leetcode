package src.sh.leetcode.algorithm.binary.tree;

import src.sh.utils.BinarySearchTree;
import src.sh.utils.TreeNode;

public class BinarySearchTreeTest {


    public static void main(String[] args) {
        TreeNode root = null;
        int[] ints = new int[]{11, 20, 10, 4, 13, 19, 50, 60, 40};
        BinarySearchTree binarySearchTree = new BinarySearchTree(root);
        for (int i : ints) {
            binarySearchTree.insert(i);
        }
        binarySearchTree.breathFirstSearch();

        binarySearchTree.delete(11);

        System.out.println(binarySearchTree.search(4));
        binarySearchTree.breathFirstSearch();
    }

}
