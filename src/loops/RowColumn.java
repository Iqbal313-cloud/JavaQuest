package loops;

public class RowColumn {

    public static void main(String[] args) {
        System.out.println("i | j values");
        System.out.println("-------------");

        // Outer loop controls rows
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " | ");  // Print row number

            // Inner loop prints column values for that row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();  // Move to next row
        }
    }
}
