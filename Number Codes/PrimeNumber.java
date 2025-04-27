// the number which is only dividible by itself

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive number : ");
        int num = sc.nextInt();
        //int temp1 = num%2;
        int count = 0;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                count++;
            }
            if(count==1){
                break;
            }
        }
        if(count==1){
            System.out.println("the given number is not a prime number ");
        }else{
            System.out.println("the given number is a prime number ");
        }

    }
}
