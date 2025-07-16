package cn.liboshuai.learning.binarysearch;

public class BinarySearch {

    /**
     * 二分查找 基础版本
     *
     * @param a      被查找的升序数组
     * @param target 需要被找到的目标元素值
     * @return 目标元素值的数组索引下标（如果没有找到元素，则索引下标返回-1）
     * 时间复杂度：O(logN)
     * 空间复杂度：O(1)
     * 知识点：
     * 1. 二分查找算法的原理
     * 2. 求中间数使用(j+i)/2时，int数据类型溢出，导致出现负数问题
     * - 1. 原码、反码、补码，为什么计算机底层存储的都是补码，它解决了什么问题？
     * - 2. Java程序中的数据类型位数是什么？为什么不同位数的数据类型，能使用的数据范围不一样？
     * - 3. 简单数学公式转换，将(j+i)/2转为i+(j-i)/2
     * 3. 如何确定时间复杂度和空间复杂度
     */
    public static int binarySearchBasic(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            int m = i + (j - i) / 2;
            if (target < a[m]) {
                j = m - 1;
            } else if (target > a[m]) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = 0;
        int j = Integer.MAX_VALUE - 1;
        int m = (i + j) / 2;
        System.out.printf("第一次求m: %d%n", m);
        // 假设 target > m，也就是目标值在中间值的右边，我们需要将i更新为m，将求值范围缩小到为右边的这一半
        i = m;
        m = (i + j) / 2;
        System.out.printf("第二次求m: %d%n", m);
    }

    /**
     * 二分查找 改进版本
     *
     * @param a      被查找的升序数组
     * @param target 需要被找到的目标元素值
     * @return 目标元素值的数组索引下标（如果没有找到元素，则索引下标返回-1）
     * 时间复杂度：O(logN)
     * 空间复杂度：O(1)
     * 知识点：
     * 1. 当 j = a.length时，下面的循环条件如何更改，j值如何更改
     */
    public static int binarySearchImproved(int[] a, int target) {
        int i = 0;
        int j = a.length;
        while (i < j) {
            int m = i + (j - i) / 2;
            if (target < a[m]) {
                j = m;
            } else if (target > a[m]) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 使用二分查找算法在一个有序数组中寻找特定目标值的索引.
     * 该方法适用于已经按升序排列的数组，利用二分法减少查找次数，提高查找效率.
     *
     * @param a 已经按升序排列的整数数组.
     * @param target 要在数组中查找的目标值.
     * @return 目标值在数组中的索引；如果目标值不在数组中，则返回-1.
     */
    public static int binarySearchBalance(int[] a, int target) {
        int i = 0;
        int j = a.length;
        while (1 < j - i) {
            int m = i + (j - i) / 2;
            if (target < a[m]) {
                j = m;
            }  else {
                i = m;
            }
        }
        return a[i] == target ? i : -1;
    }
}
