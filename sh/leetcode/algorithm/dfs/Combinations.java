package src.sh.leetcode.algorithm.dfs;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> rs = new ArrayList<>();
        dfs(n, k, rs, new ArrayList<>(), 1);
        return rs;
    }

    public static void dfs(int n, int k, List<List<Integer>> rs, List<Integer> val, int idx) {
        if (val.size() == k) {
            rs.add(new ArrayList<>(val));
            return;
        }

//        if (index <= n){
//            val.add(index);
//            dfs(n, k, rs, val, index + 1);
//            val.remove(val.size() - 1);
//            dfs(n, k, rs, val, index + 1);
//
//        }

        for (int i = idx; i <= n; i++) {
            val.add(i);
            dfs(n, k, rs, val, i + 1);
            val.remove(val.size() - 1);
        }
    }

    public static void main(String[] args) {
        combine(4, 2).forEach(System.out::println);
    }
}
