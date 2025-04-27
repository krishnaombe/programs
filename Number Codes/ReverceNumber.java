import java.util.*;

class ReverceNumber{
    public static void main(String[] args) {
        int num=1234;
        int sum=0;
        for (int i = num; i !=0; i=i/10) {
            int temp =num%10;
            sum=sum*10+temp;
            num=num/10;

        }
        System.out.println( sum );
    }
}