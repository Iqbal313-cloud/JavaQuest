package simple;

import java.util.Scanner;

public class Swap_Integers_XOR {
    public static void main(String[] args) {
        int m, n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        m = s.nextInt();
        System.out.print("Enter the second number: ");
        n = s.nextInt();

        // XOR swap logic
        m = m ^ n; // Step 1
        n = m ^ n; // Step 2
        m = m ^ n; // Step 3

        System.out.println("After Swapping");
        System.out.println("First number: " + m);
        System.out.println("Second number: " + n);


    }
}
