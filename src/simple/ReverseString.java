package simple;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to reverse: ");

        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);

        char[] chars = str.toCharArray();

        // Use a for-each loop, but build reversed string manually
        String reversedv2 = "";
        for (char c : chars) {
            reversedv2 = c + reversedv2; // Prepend each character
        }

        System.out.println("Reversed string: " + reversedv2);


    }
}
