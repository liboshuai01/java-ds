package cn.liboshuai.learning.algorithm.recursion;

import java.util.Arrays;

/**
 * 冒泡排序（递归版本）
 */
public class E04BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[]{8, 9, 4, 2, 7, 5, 6, 3};
        x(nums, nums.length - 1);
        System.out.println("nums: " + Arrays.toString(nums));
    }


    public static void x(int[] nums, int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[i+1]) {
                int t = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = t;
            }
        }
        x(nums, n - 1);
    }
}
