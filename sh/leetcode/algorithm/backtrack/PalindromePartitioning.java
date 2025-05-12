package src.sh.leetcode.algorithm.backtrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

//Input: s = "aab"
//Input: s = "aab"
//Output: [["a","a","b"],["aa","b"]]
public class PalindromePartitioning {
    public static List<List<String>> partition(String s) {
        List<List<String>> rs = new ArrayList<>();

        backtrack(rs, s, new ArrayList<>(), 0);
        return rs;

    }

    public static void backtrack(List<List<String>> rs, String s, List<String> val, int start) {

        if (start == s.length()) {
            rs.add(new ArrayList<>(val));
            return;
        }

        for (int i = start + 1; i <= s.length(); i++) {
            if (isPalindrome(s, start, i - 1)) {
                val.add(s.substring(start, i));
                backtrack(rs, s, val, i);
                val.remove(val.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        partition(s).forEach(System.out::println);
    }
}
