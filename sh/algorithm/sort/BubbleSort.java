package src.sh.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

    /*
     * xap xep noi bot
     * */
    public static void main(String[] args) {
        int[] nums = new int[]{46, 4, 5, 8, 1, 5};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        Arrays.stream(nums).forEach(System.out::println);
    }
}
