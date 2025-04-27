import java.util.Scanner;

public class SwappingWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int a = sc.nextInt();
        System.out.print("enter second number : ");
        int b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping");
        System.out.println("first number is : "+a);
        System.out.println("second number is : "+b);

        // with third variable
        // int c=0;
        // c=a;
        // a=b;
        // b=c;
    }
}
