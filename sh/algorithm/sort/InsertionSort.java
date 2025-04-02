package src.sh.algorithm.sort;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {
        int[] nums = new int[]{6, 4, 5, 8, 1, 5};


        int j, cur;
        for (int i = 1; i < nums.length; i++) {
            j = i - 1;
            cur = nums[i];
            while (j >= 0 && nums[j] > cur) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = cur;
        }


        Arrays.stream(nums).forEach(System.out::println);


    }
}
