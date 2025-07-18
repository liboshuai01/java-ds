package cn.liboshuai.learning.algorithm.recursion;

/**
 * 方向打印字符串（使用递归）
 */
public class E02ReversePrintString {
    public static void main(String[] args) {
        String s = "string";
        f(s, s.length() - 1);
    }

    public static void f(String s, int n) {
        if (n < 0) {
            return;
        }
        System.out.println(s.charAt(n));
        f(s, n - 1);
    }
}
