package cn.liboshuai.learning.algorithm.recursion;

public class E01Factorial {
    public static void main(String[] args) {
        f(5);
    }

    public static void f(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("倒序打印: n = " + n);
        f(n - 1);
        System.out.println("正序打印: n = " + n);
    }
}
