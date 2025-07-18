package cn.liboshuai.learning.algorithm.recursion;

/**
 * 二分查找（递归版本）
 */
public class E03BinarySearch {


    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 7, 9, 20, 30};
        int r = f(nums, 5, 0, nums.length - 1);
        System.out.println("结果: " + r);
    }

    public static int f(int[] nums, int target, int i, int j) {
        if (i > j) {
            return -1;
        }
        int m = i + (j - i) / 2;
        if (target < nums[m]) {
            return f(nums, target, i, m - 1);
        } else if (target > nums[m]) {
            return f(nums, target, m + 1, j);
        } else  {
            return m;
        }
    }
}
