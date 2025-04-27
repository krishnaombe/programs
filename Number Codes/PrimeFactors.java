// eg= prime factors of number 30 is 2,3,5

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any positive number : ");
        int num = sc.nextInt();

        System.out.println("the prime factors of given number is : ");
        for(int i=2 ; i<=num/2 ; i++){
            int count=0;
            if(num%i==0){
                for(int j=1 ; j<=i ; j++){
                    if(i%j==0){
                        count++;
                    }
                    if(count==3){
                        break;
                    }
                }
                if(count<=2){
                    System.out.println(i+" ");
                }
            }
        }
    }
}
