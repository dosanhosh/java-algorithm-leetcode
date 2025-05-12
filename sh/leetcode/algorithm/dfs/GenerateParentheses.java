package src.sh.leetcode.algorithm.dfs;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> rs = new ArrayList<>();
        backtrack(rs, n, new StringBuilder(), 0, 0);

        return rs;
    }

    public static void backtrack(List<String> rs, int n, StringBuilder value, int left, int right) {
        if (left == n && right == n) {
            rs.add(value.toString());
            return;
        }

        if (left < n) {
            backtrack(rs, n, value.append("("), left + 1, right);
            value.deleteCharAt(value.length() - 1);

        }
        if (right < left) {
            backtrack(rs, n, value.append(")"), left, right + 1);
            value.deleteCharAt(value.length() - 1);

        }
    }


    public static void main(String[] args) {
        generateParenthesis(3).forEach(System.out::println);
    }
}
