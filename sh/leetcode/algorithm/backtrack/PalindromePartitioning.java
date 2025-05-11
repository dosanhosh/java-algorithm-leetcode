package src.sh.leetcode.algorithm.backtrack;

import java.util.ArrayList;
import java.util.List;

//Input: s = "aab"
//Output: [["a","a","b"],["aa","b"]]Input: s = "aab"
//Output: [["a","a","b"],["aa","b"]]
public class PalindromePartitioning {
    public static List<List<String>> partition(String s) {
        List<List<String>> rs = new ArrayList<>();
        backtrack(rs, s, new ArrayList<>(), 0, 1);
        return rs;

    }

    public static void backtrack(List<List<String>> rs, String s, List<String> val, int start, int end) {
        if (start == s.length()) {
            rs.add(new ArrayList<>(val));
            return;
        }
        val.add(s.substring(start, end));
        backtrack(rs, s, val, start + 1, end + 1);

    }

    public static void main(String[] args) {
        String s = "aab";
        partition(s).forEach(System.out::println);
    }
}
