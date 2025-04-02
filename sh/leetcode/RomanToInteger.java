package src.sh.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static Map<String, Integer> tableRoman = new HashMap();

    static {
        tableRoman.put("M", 1000);
        tableRoman.put("CM", 900);
        tableRoman.put("D", 500);
        tableRoman.put("CD", 400);
        tableRoman.put("C", 100);
        tableRoman.put("XC", 90);
        tableRoman.put("L", 50);
        tableRoman.put("XL", 40);
        tableRoman.put("X", 10);
        tableRoman.put("IX", 9);
        tableRoman.put("V", 5);
        tableRoman.put("IV", 4);
        tableRoman.put("I", 1);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int i = 0;
        int curr = 0;
        while (i < s.length()) {
            String key = String.valueOf(s.charAt(i));
            int value = tableRoman.get(key);

            if(curr >= value)  result += value;
            else {
                result += value - (curr * 2);
            }
            curr =  value;
            i++;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
