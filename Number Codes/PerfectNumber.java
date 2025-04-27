import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive number : ");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1 ; i<=num/2 ; i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum!=0 && num%sum==0){
            System.out.println(num+" is a perfect number");
        }else{
            System.out.println(num+" is not a perfect number");
        }
    }
}
