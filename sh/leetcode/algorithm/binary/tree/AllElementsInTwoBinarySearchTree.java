package src.sh.leetcode.algorithm.binary.tree;

import src.sh.utils.TreeNode;

import java.util.*;

public class AllElementsInTwoBinarySearchTree {
    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

//        List<Integer> rs = new ArrayList<>();
//        getValues(root1, rs);
//        getValues(root2, rs);
//        Collections.sort(rs);
//        return rs;

        Stack<Integer> stack1 = new Stack<>(), stack2 = new Stack<>();
        getValues(root1, stack1);
        getValues(root2, stack2);
        List<Integer> res = new ArrayList<>();
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int num1 = (stack1.isEmpty()) ? Integer.MAX_VALUE : stack1.peek();
            int num2 = (stack2.isEmpty()) ? Integer.MAX_VALUE : stack2.peek();
            if (num1 <= num2) res.add(stack1.pop());
            else res.add(stack2.pop());
        }
        return res;
    }

    public static void getValues(TreeNode node, List<Integer> rs) {
        if (node == null) return;
        getValues(node.left, rs);
        rs.add(node.val);
        getValues(node.right, rs);
    }

    public static void getValues(TreeNode node, Stack<Integer> stack) {
        if (node == null) return;
        getValues(node.right, stack);
        stack.push(node.val);
        getValues(node.left, stack);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2, new TreeNode(1), new TreeNode(4));
        TreeNode root2 = new TreeNode(1, new TreeNode(0), new TreeNode(3));

        List<Integer> ls = getAllElements(root1, root2);
        ls.forEach(System.out::println);
    }
}
