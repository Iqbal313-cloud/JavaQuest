package simple;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 6, 9);

        Integer sum = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(sum);
    }
}
