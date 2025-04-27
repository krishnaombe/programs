//153= 1^3+5^3+3^3 =153

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive number : ");
        int num=sc.nextInt();
        int sum=0;
        
        for (int i = num; i != 0; i=i/10) {;
            int mult=1;
            int temp=i%10;
            // for(int j=3 ; j!=0 ; j--){
            //     mult=mult*temp;
            // }

            sum=sum+temp*temp*temp;
        }
        if(sum==num){
            System.out.println("the given number as an armstrong number");
        }else{
            System.out.println("the given number is not an armstrong number");
        }
    }
}
