package src.sh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {

//            for (int i = 0; i < numRows; i++) {
//            for (int j = 0; j < s.length() / 2; j++) {
//                if (arr[i][j] == null) System.out.print(" ");
//                else
//                    System.out.print(arr[i][j]);
//            }
//            System.out.print("\n");
//        }
    public static String convert(String s, int numRows) {
        int maxCol = s.length() / 2;
        maxCol  = s.length() % 2 > 0  ? maxCol + 1 : maxCol;
        if (numRows > s.length() || numRows == 1) return s;

        Character[][] arr = new Character[numRows][maxCol];
        int row = 0;
        int col = 0;
        int index = 0;

        boolean flag = true;
        while (index < s.length()) {
            arr[row][col] = s.charAt(index);

            if (row < numRows - 1 && flag) {
                row++;
            } else {
                flag = false;
                row--;
                col++;
                if (row == 0) flag = true;
            }
            index++;
        }


        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length() / 2; j++) {
                if (arr[i][j] == null) System.out.print(" ");
                else
                    System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < maxCol; j++) {

                if (arr[i][j] != null)
                    result.append(arr[i][j]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("AB", 1));
        System.out.println(convert("ABC", 2));
    }
}
