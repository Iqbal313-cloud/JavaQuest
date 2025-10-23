package loops;

public class PatternTable {
    public static void main(String[] args) {
        System.out.println("+---+----------------+");
        System.out.println("| i | j (per row)    |");
        System.out.println("+---+----------------+");

        //outer loop controls the rows
        for (int i = 1; i <= 5; i++) {
            System.out.print("| " + i + "| ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Add spacing to keep columns aligned
            for (int s = i; s < 5; s++) {
                System.out.print("  ");
            }
            System.out.println(" |");
        }
        System.out.println("+---+----------------+");

    }
}
