// eg : 10=0 1 1 2 3 5 8 13 21 34

import java.util.Scanner;

public class FibonacciSeriesWithIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number : ");
        int num = sc.nextInt();

        int count = num;
        int a = 0;
        int b = 1;
        System.out.print(" " + a +" "+ b );
        int c;
        for (int i = 3; i <= num; i++) {
            c=a+b;
            System.err.print(" " + c);
            a=b;
            b=c;
        }
    }
}
