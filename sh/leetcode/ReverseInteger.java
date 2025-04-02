package src.sh.leetcode;

public class ReverseInteger {
    public static int reverse(int x) {
        int remainder;

        int result = 0;
        while (x != 0) {
            remainder = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && remainder > 7)) return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && remainder < -8)) return 0;
            result = (result * 10) + remainder;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
    }
}
