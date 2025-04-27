
import java.util.Scanner;

public class SmallestNumberInGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : ");
        int num=sc.nextInt();
        int small=9;
        for(int i=num ; i!=0 ; i=i/10){
            int temp=i%10;
            if(small>temp){
                small=temp;
            }
            num=num/10;
        }
        System.out.println("the smallest digit in given number is : " + small);
    }
}
