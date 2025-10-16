package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrences {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> map = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> counts = items.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(counts);

        System.out.println(map);
    }
}
