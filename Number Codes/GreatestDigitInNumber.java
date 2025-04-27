import java.util.*;

public class GreatestDigitInNumber {

    static int Bignumber(int num , int temp ){
        if(num==0){
            return temp;
        }
        if(temp<=(num%10)){
            temp=num%10;
        }
        return Bignumber(num/10, temp);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter anypositive number : ");
        int num = sc.nextInt();

        int Big=Bignumber(num,0);
        System.out.println("the greatest digit in number is : "+Big);
    }
}
