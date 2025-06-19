package src.sh.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = new int[]{6, 4, 5, 8, 1, 5, -19};
        mergeSort(nums, 0, nums.length - 1);
        Arrays.stream(nums).forEach(System.out::println);
    }

    // len
    public static void mergeSort(int[] nums, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        mergeSort(nums, start, mid, end);
    }

    public static void mergeSort(int[] nums, int start, int mid, int end) {
        int nLeft = mid - start + 1;
        int nRight = end - mid;

        int[] left = new int[nLeft];
        int[] right = new int[nRight];

        for (int i = 0; i < nLeft; i++) {
            left[i] = nums[start + i];
        }

        for (int i = 0; i < nRight; i++) {
            right[i] = nums[mid + 1 + i];
        }
        int i = 0, j = 0, k = start;

        while (i < nLeft && j < nRight) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        while (i < nLeft) {
            nums[k++] = left[i++];
        }
        while (j < nRight) {
            nums[k++] = right[j++];
        }
    }
}
