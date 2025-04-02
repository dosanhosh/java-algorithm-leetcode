package src.sh.leetcode;

import java.util.Arrays;
import java.util.Map;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        if (num < 1 || num > 3999) return result.toString();

        int remainder = 0;
        int i = 0;
        while (num != 0) {
            remainder = num % 10;
            num = num / 10;
            convert(i, remainder, result);
            i++;
        }

        return result.toString();
    }

    public static void convert(int i, int remainder, StringBuilder result) {
        int value = i != 0 ? (int) (Math.pow(10, i) * remainder) : remainder;

        if (value == 1) result.insert(0, "I");
        else if (value == 4) result.insert(0, "IV");
        else if (value == 5) result.insert(0, "V");
        else if (value == 9) result.insert(0, "IX");
        else if (value == 10) result.insert(0, "X");
        else if (value == 40) result.insert(0, "XL");
        else if (value == 50) result.insert(0, "L");
        else if (value == 90) result.insert(0, "XC");
        else if (value == 100) result.insert(0, "C");
        else if (value == 400) result.insert(0, "CD");
        else if (value == 500) result.insert(0, "D");
        else if (value == 900) result.insert(0, "CM");
        else if (value == 1000) result.insert(0, "M");
        else {
            if (remainder < 5) {
                for (int j = 0; j < remainder; j++) {
                    convert(i, 1, result);
                }
            } else {
                convert(i, remainder % 5, result);
                convert(i, 5, result);
            }
        }
    }

    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String intToRoman2(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length && num > 0; i++) {
            int value = values[i];
            while (value <= num) {
                num = num - value;
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman2(3749));
//        System.out.println(intToRoman2(1));
    }
}
