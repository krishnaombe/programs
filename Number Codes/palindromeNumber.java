//121=121

import java.util.*;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive number : ");
        int num = sc.nextInt();
        int sum=0;
        for (int i = num; i !=0; i=i/10) {
            int temp =i%10;
            sum=sum*10+temp;
        }
        if(sum==num){
            System.out.println(" : Number is a palindrome number");
        }else{
            System.out.println(" : Number is not a palindrome number");
        }
    }
}
