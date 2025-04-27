import java.util.*;

public class SumOfDigits {

    static long  Sum(long num , long temp){
        if(num==0){
            return temp;
        }
        temp=temp+num%10;
        return Sum(num/10, temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive number : ");
        long num = sc.nextLong();
        long temp = Sum(num,0);
        System.out.println("the sum of all digits in number is : "+temp);
    }
}
