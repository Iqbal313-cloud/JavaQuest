package simple;

import java.util.Arrays;
import java.util.List;

public class CounterGreaterThan {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 6, 8, 95, 9);

        System.out.println(number);

        long count = number.stream().filter(n -> n > 6).count();
        System.out.println(count);

    }
}
