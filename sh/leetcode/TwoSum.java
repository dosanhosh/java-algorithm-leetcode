package src.sh.leetcode;

class TwoSum {
    // my code
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] + nums[j] == target && i != j) return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    // result
//        public int[] twoSum(int[] nums, int target) {
//            for (int i = 0; i < nums.length; i++) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[j] == target - nums[i]) {
//                        return new int[] { i, j };
//                    }
//                }
//            }
//            // If no valid pair is found, return an empty array instead of null
//            return new int[] {};
//        }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}


