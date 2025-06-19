package src.sh.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{ 8, 7, 2, 1, 0, 9, 6 };
        int size = nums.length;
        quickSort(nums, 0, size - 1);
        Arrays.stream(nums).forEach(System.out::println);

    }


    public static void quickSort(int[] nums, int start, int end) {
        if (start >= end) return;
        int pi = partition(nums, start, end);
        quickSort(nums, start, pi - 1);
        quickSort(nums, pi + 1, end);
    }


    public static int partition(int[] nums, int low, int high) {
        int i = low - 1;
        int pivot = nums[high];

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }


        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }
}
