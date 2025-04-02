package src.sh.utils;

public class SortUtil {

    public static void swap(int[] nums, int a, int b) {
        int curr = nums[a];
        nums[a] = nums[b];
        nums[b] = curr;
    }
}
