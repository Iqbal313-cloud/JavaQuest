package chap04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static chap04.Dish.menu;
import static java.util.stream.Collectors.toList;

public class Mapping {
    public static void main(String[] args) {

        List<String> dishNames = menu.stream().map(Dish::getName).collect(toList());
        System.out.println(dishNames);

        //map
        List<String> words = Arrays.asList("Allahummah", "Agfirlee");
        List<Integer> wordsLengths = words.stream().map(String::length).collect(toList());
        System.out.println(wordsLengths);

        //flatMap
        words.stream().flatMap((String line) -> Arrays.stream(line.split(""))).forEach(System.out::println);

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

    
}
