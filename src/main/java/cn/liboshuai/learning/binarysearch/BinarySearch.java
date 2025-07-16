package cn.liboshuai.learning.binarysearch;

public class BinarySearch {

    /**
     * 二分查找 基础版本
     * @param a 被查找的升序数组
     * @param target 需要被找到的目标元素值
     * @return  目标元素值的数组索引下标（如果没有找到元素，则索引下标返回-1）
     */
    public static int binarySearchBasic(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            int middle = i + (j - i) / 2;
            if (target < a[middle]) {
                j = middle - 1;
            } else if (target > a[middle]) {
                i = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
     * 二分查找 改进版本
     * @param a 被查找的升序数组
     * @param target 需要被找到的目标元素值
     * @return  目标元素值的数组索引下标（如果没有找到元素，则索引下标返回-1）
     */
    public static int binarySearchImproved(int[] a, int target) {
        int i = 0;
        int j = a.length;
        while (i < j) {
            int middle = i + (j - i) / 2;
            if (target < a[middle]) {
                j = middle;
            } else if (target > a[middle]) {
                i = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
