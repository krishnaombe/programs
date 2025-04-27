import java.util.Scanner;

public class CubeOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : ");
        int num = sc.nextInt();
        System.out.println("the cube of given number is : "+ num*num*num);
    }
}
