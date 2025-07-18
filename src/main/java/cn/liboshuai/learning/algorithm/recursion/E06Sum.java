package cn.liboshuai.learning.algorithm.recursion;

/**
 * 递归求和 n + n-1, ... + 1
 */
public class E06Sum {
    public static void main(String[] args) {
        int result = sum(1500);
        System.out.println("结果为: " + result);
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum (n - 1);
    }
}
