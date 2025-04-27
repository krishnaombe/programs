
import java.util.*;
public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive number : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("the given number is even ");
        }else{
            System.out.println("the given number is odd ");
        }
        
    }
}
