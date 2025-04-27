import java.util.Scanner;

public class AverageOfIntegerArray {
    static long sum(long num ,long temp,long count){
        if(num==0){
            return temp=temp/count;
        }
        temp=temp+num%10;
        count++;
        return sum(num/10,temp,count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive number : ");
        long num = sc.nextLong();
        long total = sum(num,0,0);
        System.out.println("the average of the given number is : "+total);
    }
}
