package cn.liboshuai.learning.binarysearch;

public class BinarySearch {

    /**
     * 二分查找 基础版本
     * @param a 被查找的升序数组
     * @param target 需要被找到的目标元素值
     * @return  目标元素值的数组索引下标（如果没有找到元素，则索引下标返回-1）
     * 时间复杂度：O(logN)
     * 空间复杂度：O(1)
     * 知识点：
     * 1. 二分查找算法的原理
     * 2. 求中间数使用(j+i)/2时，int数据类型溢出，导致出现负数问题
     *  - 1. 原码、反码、补码
     *  - 2. 简单数学公式转换，将(j+i)/2转为i+(j-i)/2
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
     * 时间复杂度：O(logN)
     * 空间复杂度：O(1)
     * 知识点：
     * 1. 当 j = a.length时，下面的循环条件如何更改，j值如何更改
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
