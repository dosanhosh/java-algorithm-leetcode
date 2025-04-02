package src.sh.algorithm.sort;

import src.sh.utils.SortUtil;

import java.security.Key;
import java.util.Arrays;


public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{6, 4, 5, 8, 1, 5};

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            int key = i;
            for (int j = i + 1; j < length; j++) {

                if (nums[j] < nums[key]) {
                    key = j;
                }
            }
            SortUtil.swap(nums, key, i);
        }

        Arrays.stream(nums).forEach(System.out::println);
    }
}
