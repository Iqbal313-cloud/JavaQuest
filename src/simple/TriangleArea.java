package simple;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate area
        double area = 0.5 * base * height;

        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);

        scanner.close();
    }
}
