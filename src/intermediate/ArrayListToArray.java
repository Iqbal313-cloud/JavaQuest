package intermediate;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {

        //create an arrayList
        ArrayList<Integer> al = new ArrayList<Integer>();

        //add elements to the array list
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println("Contents of al: " + al);

        //get the array

        Integer[] ia = new Integer[al.size()];

        ia = al.toArray(ia);

        System.out.println(Arrays.toString(ia));

        int sum = 0;
        // Sum the array.
        for (int i : ia) sum += i;
        System.out.println("Sum is: " + sum);

    }
}
