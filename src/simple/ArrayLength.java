package simple;

public class ArrayLength {
    public static void main(String[] args) {
        int[] a = {1, 2, 34, 6,};

        int count = 0;
        for (int value : a) {
            count++;
        }
        System.out.println("Number of elements in array: " + count);
        System.out.println("Number of elements (using length): " + a.length);

    }
}
