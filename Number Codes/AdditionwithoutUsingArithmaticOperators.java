public class AdditionwithoutUsingArithmaticOperators {
    public static int add(int a, int b) {
        while (b != 0) {  // Loop until no carry left
            int carry = a & b;  // Step 2: Find carry bits
            a = a ^ b;          // Step 1: XOR for sum without carry
            b = carry << 1;      // Step 2: Shift carry for next addition
        }
        return a;  // Final sum
    }

    public static void main(String[] args) {
        int num1 = 25, num2 = 17;
        System.out.println("Sum: " + add(num1, num2));  // Output: 42
    }
}
