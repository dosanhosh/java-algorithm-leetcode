package src.sh.leetcode.algorithm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            boolean flag = true;
            String regex = strs[0].substring(0, i + 1) + ".*";
            Pattern pattern = Pattern.compile(regex);

            for (int j = 1; j < strs.length; j++) {
                Matcher matcher = pattern.matcher(strs[j]);
                if (!matcher.matches()) flag = false;
            }

            if (flag) result.append(strs[0].charAt(i));
            else break;
        }
        return result.toString();
    }

    public static String longestCommonPrefix2(String[] strs) {

        String result = "";
        String firstStr = strs[0];
        boolean flag = true;

        for (int i = 0; i < firstStr.length(); i++) {
            String key = firstStr.substring(0, i + 1);
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(key)) flag = false;
            }
            if (!flag) break;
            result = key;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix2(strs));
//        String[] strs = new String[]{"a"};
//        System.out.println(longestCommonPrefix2(strs));
    }
}
