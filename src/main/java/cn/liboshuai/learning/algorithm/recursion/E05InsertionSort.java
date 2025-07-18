package cn.liboshuai.learning.algorithm.recursion;

/**
 * 递归插入排序
 */
public class E05InsertionSort {

    public static void sort(int[] a){
        x(a, 1);
    }

    public static void x (int[] nums, int low) {
        if (low == nums.length) {
            return;
        }
        for (int i = low; i > 0; i--) {
            if(nums[i - 1] > nums[i]) {
                int t = nums[i];
                nums[i] = nums[i -1];
                nums[i - 1] = t;
            } else {
                break;
            }
        }
        x(nums, low + 1);
    }
}
