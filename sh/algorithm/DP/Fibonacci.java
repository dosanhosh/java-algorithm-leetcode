package src.sh.algorithm.DP;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    public static int fibonacci(int n) {
        if (n < 1) return n;


        int prev = 0, next = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = prev + next;
            prev = next;
            next = tmp;
        }
        return next;
    }
}
