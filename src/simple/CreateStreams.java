package simple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreams {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Abu basir", "Al-Gifari");

        Stream<String> stream = names.stream();

        String[] arr = {"java", "python", "c++"};

        Stream<String> stream2 = Arrays.stream(arr);

        Stream<Integer> integerStream = Stream.of(1, 2, 3);


        Stream<Double> limit = Stream.generate(Math::random).limit(5);

        System.out.println(limit);

        List<Double> randomNumbers = limit.collect(Collectors.toList());
        System.out.println(randomNumbers);

        System.out.println(stream2);
    }
}
