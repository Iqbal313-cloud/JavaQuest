package loops;

public class PatternOne {

    public static void main(String[] args) {

        // Outer loop: runs 5 times (i = 1 to 5)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Entering i loop, i = " + i);

            // Middle loop: runs 5 times for each i (j = 1 to 5)
            for (int j = 1; j <= 5; j++) {
                System.out.println("  Entering j loop, j = " + j);

                // Innermost loop: runs 5 times for each j (k = 1 to 5)
                for (int k = 1; k <= 5; k++) {
                    // Prints the current combination of i, j, and k
                    System.out.println("    Current combination: i=" + i + ", j=" + j + ", k=" + k);

                    // Indicates the innermost loop is executing
                    System.out.println("    Speaking from k loop, k = " + k);
                }

                // Prints a blank line after finishing one full k loop cycle
                System.out.println();
            }

            // Prints an extra line after finishing one full j loop cycle
            System.out.println();
        }
    }
}


