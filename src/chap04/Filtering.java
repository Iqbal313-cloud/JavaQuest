package chap04;

import java.util.Arrays;
import java.util.List;

import static chap04.Dish.menu;
import static java.util.stream.Collectors.toList;

public class Filtering {
    public static void main(String[] args) {

        System.out.println("Filtering with a predicate method reference");
        List<Dish> vegetarianMenu = menu.stream().filter(Dish::isVegetarian).collect(toList());
        vegetarianMenu.forEach(System.out::println);


        //Filtering even unique elements
        System.out.println("Filtering unique elements");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 6, 5, 6);

        numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);

        //slcing a stream
        List<Dish> specialMenu = Arrays.asList(
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));
        System.out.println("Filtered sorted menu:");

        List<Dish> filteredMenu = specialMenu.stream().filter(dish -> dish.getCalories() < 320).collect(toList());

        filteredMenu.forEach(System.out::println);
        //Sorted menu sliced with takeWhile
        System.out.println("Sorted menu sliced with takeWhile():");

        List<Dish> slicedMenu2 = specialMenu.stream().takeWhile(dish -> dish.getCalories() < 320).collect(toList());
        slicedMenu2.forEach(System.out::println);

        //Truncationg a stream
        System.out.println("Before truncating");
        List<Dish> dishesLimit3 = menu.stream().filter(d -> d.getCalories() > 300).limit(3).collect(toList());
        dishesLimit3.forEach(System.out::println);

        // Skipping elements
        List<Dish> dishesSkip2 = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(toList());
        System.out.println("Skipping elements:");
        dishesSkip2.forEach(System.out::println);


    }
}
