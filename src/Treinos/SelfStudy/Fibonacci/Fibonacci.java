package Treinos.SelfStudy.Fibonacci;

public class Fibonacci {

    public static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }

    }
}