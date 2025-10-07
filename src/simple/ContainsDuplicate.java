package simple;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] testArray1 = {1, 2, 3, 4, 5};
        int[] testArray2 = {1, 2, 3, 1};

        System.out.println("Test Array 1 contains duplicates: " + hasDuplicates(testArray1));
        System.out.println("Test Array 2 contains duplicates: " + hasDuplicates(testArray2));
    }

    public static boolean hasDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}

