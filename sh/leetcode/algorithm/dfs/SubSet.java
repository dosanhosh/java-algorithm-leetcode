package src.sh.leetcode.algorithm.dfs;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        backtrack(nums, rs, new ArrayList<>(), 0);
        return rs;
    }

    public static void backtrack(int[] nums, List<List<Integer>> rs, List<Integer> values, int idx) {
        if (idx == nums.length) {
            rs.add(new ArrayList<>(values));
            return;
        }
        values.add(nums[idx]);
        backtrack(nums, rs, values, idx + 1);
        // idx = 2
        // idx = 1
        // idx = 0

        values.remove(values.size() - 1);
        backtrack(nums, rs, values, idx + 1);

    }

    public static void main(String[] args) {
        subsets(new int[]{1, 2, 3}).forEach(System.out::println);
    }
}
