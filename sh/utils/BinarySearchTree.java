package src.sh.utils;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public TreeNode root;

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }

    public void insert(int val) {
        root = this.insert(root, val);
    }

    public boolean search(int val) {
        return this.search(root, val);
    }

    public void delete(int val) {
        root = this.delete(root, val);
    }

    public void inorder() {
        this.inorder(root);
    }

    public void breathFirstSearch() {
        this.breathFirstSearch(root);
    }

    TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else if (val > root.val) root.right = insert(root.right, val);
        return root;
    }

    boolean search(TreeNode root, int val) {
        if (root == null) return false;
        if (val == root.val) return true;
        else if (val < root.val) return search(root.left, val);
        else return search(root.right, val);
    }

    TreeNode delete(TreeNode root, int val) {
        if (root == null) return null;
        if (val < root.val) root.left = delete(root.left, val);
        else if (val > root.val) root.right = delete(root.right, val);

        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // find min of node right
            TreeNode minRight = findMin(root.right);
            // change node min right = node delete
            root.val = minRight.val;
            root.right = delete(root.right, root.val);
        }
        return root;

    }

    TreeNode findMin(TreeNode node) {
        while (node.left != null){
            node = node.left;
        }
        return node;
    }

    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val);
        inorder(node.right);
    }

    void breathFirstSearch(TreeNode node) {
        if (node == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }

}

