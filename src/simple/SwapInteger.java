package simple;

import java.util.Scanner;

public class SwapInteger {

    public static void main(String[] args) {
        int m, n;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        m = s.nextInt();
        System.out.print("Enter the Second Number: ");
        n = s.nextInt();

        m = m + n;
        n = m - n;
        m = m - n;

        System.out.println("After Swapping");
        System.out.println("First number:" + m);
        System.out.println("Second number:" + n);
    }
}

