package simple;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("SubhanAllah", "Alhamdulillah", "Astagfirullah");


        Optional<String> longestString = words.stream().reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2);

        longestString.ifPresent(System.out::println);


    }
}
