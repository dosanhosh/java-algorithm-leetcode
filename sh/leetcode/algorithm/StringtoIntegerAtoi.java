package src.sh.leetcode.algorithm;

public class StringtoIntegerAtoi {

    public static int myAtoi(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && result.isEmpty()) continue;
            else if (result.length() == 1 &&
                    (result.toString().startsWith("0") || result.toString().startsWith("-") || result.toString().startsWith("+"))
                    && s.charAt(i) == '0')
                continue;
            else if ((s.charAt(i) == '-' || s.charAt(i) == '+') && result.isEmpty()) {
                result.append(s.charAt(i));
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                result.append(s.charAt(i));
            else break;
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        System.out.printf(String.valueOf(myAtoi("    +1146905820")));
    }
}
