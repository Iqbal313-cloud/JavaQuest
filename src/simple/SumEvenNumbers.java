package simple;

import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6);

        Integer evenSum = numbers.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);

        System.out.println(evenSum);
    }
}
