package src.sh.leetcode.algorithm;

public class AddBinary {

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0)
                carry += a.charAt(i--) - '0';
            if (j >= 0)
                carry += b.charAt(j--) - '0';

            sb.append(carry % 2);
            carry = carry / 2;
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        // Convert the string to binary
        String binaryString = addBinary(a, b);

        System.out.println(binaryString);
    }


}
