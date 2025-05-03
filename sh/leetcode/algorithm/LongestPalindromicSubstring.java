package src.sh.leetcode.algorithm;

import java.util.*;

public class LongestPalindromicSubstring {

    /*
     * palindrome 1 chuoi doc 2 dau giong nhau vd: aba
     * first and last the same vd: aba => if length string > 3
     * all character the same vd : bbbb
     * */
    public static String longestPalindrome(String s) {
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                if (isCheck(j, j + i, s))
                    return s.substring(j, j + i);
            }
        }
        return "";
    }

    public static boolean isCheck(int i, int j, String s) {

        int left = i;
        int right = j - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("acbbbbbbd"));
    }
}
