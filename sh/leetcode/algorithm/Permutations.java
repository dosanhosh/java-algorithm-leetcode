package src.sh.leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums, result, 0);
        return result;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void permutation(int[] nums, List<List<Integer>> result, int idx) {
        if (idx == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            result.add(temp);

            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            permutation(nums, result, idx + 1);
            swap(nums, idx, i);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        permute(nums).forEach(System.out::println);
    }
}
