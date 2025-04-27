import java.util.*;

public class PalindromeNumberUsingPalindrome {
    
    static int ReverceNumber(int num , int temp){
        if(num==0){
            return temp;
        }
        temp=temp*10+num%10;

        return ReverceNumber(num/10,temp);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter anypositive number : ");
        int num = sc.nextInt();
        int temp =ReverceNumber(num,0);

        if(temp==num){
            System.out.println(" : Number is a palindrome number");
        }else{
            System.out.println(" : Number is not a palindrome number");
        }

    }
}
