package chap04;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BuildingStreams {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Java", "Lambda", "in", "action");
        stream.map(String::toLowerCase).forEach(System.out::println);

        //Arrays.stream
        int[] numbers = {2, 3, 4, 5, 7, 11, 13};
//        System.out.println(Arrays.stream(numbers).sum());


        //Stream.iterate
        
//        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);
//
//        //random stream of doubles with Stream.generate
//        Stream.generate(Math::random).limit(10).forEach(System.out::println);
//
//        Stream.generate(() -> 5 + Math.random() * (15 - 5))
//                .limit(10)
//                .forEach(System.out::println);

        // random stream of doubles with Stream.generate

        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        IntStream.generate(() -> 1).limit(5).forEach(System.out::println);

    }
}
