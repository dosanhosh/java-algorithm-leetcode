package src.sh.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

    /*
    * xap xep noi bot
    * */
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 45, 0, 11, -9};

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int curr = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = curr;
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
