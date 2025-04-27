// ex.. 6=6*5*4*3*2*1=720

import java.util.*;
public class FactorialUsinRecursion {
    public static int Factors(int num){
        if(num!=0)
            return num*Factors(num-1);
        else
            return 1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive number : ");
        int num = sc.nextInt();
        int total = Factors(num);
        System.out.println("Factorial of given number is : "+total);
    }
}
