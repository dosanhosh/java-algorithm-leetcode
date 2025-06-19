package src.sh.algorithm.sort;

import src.sh.utils.SortUtil;

import java.security.Key;
import java.util.Arrays;


public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{6, 4, 5, 8, 1, 5};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        Arrays.stream(nums).forEach(System.out::println);

    }
}
