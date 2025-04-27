import java.util.*;

public class FibonacciSeriesWithRecursion {
    public static void main(String[] args) {
        int n = 11; // Number of terms in the series
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
