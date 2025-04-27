import java.util.Scanner;

public class PrimeNumberInGivenRange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Start number : ");
        int Start = sc.nextInt();
        System.out.println("enter End number : ");
        int End = sc.nextInt();
        
        
        for (int i = Start; i < End; i++) {
            int count = 0;
            for(int j=2 ; j<Start ; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print(i + " ");
            }

        }

    }
}
