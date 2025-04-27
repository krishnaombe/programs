import java.util.Scanner;

public class SqureRootOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = sc.nextInt();
        for(int i=1 ; i<num ; i++){
            if (i*i==num) {
                System.out.println("the square root of given number is : "+ i);    
            }
        }
    }
}
