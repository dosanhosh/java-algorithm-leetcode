package src.sh.leetcode;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int minHeight = Math.min(height[left],height[right]);
            result = Math.max(result, (right - left) * minHeight);

            while (left < right && height[left] <= minHeight) left++;
            while (left < right && height[right] <= minHeight) right--;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] s = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(s));
    }
}
