package day3b;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamVoorbeeld {
    public static void main(String[] args) {
        String[] namen = {"Julius", "Ted", "Maaike", "Bobbi"};

//        for(String naam: namen) {
//            if(naam.startsWith("B")){
//                System.out.println(naam);
//            }
//        }

        // stream: start + optionele tussen operaties + eind operatie
        Arrays.stream(namen).forEach(s -> System.out.println(s));

        Arrays.stream(namen).filter(s -> s.length() > 3).forEach(s -> System.out.println(s));

        Arrays.stream(namen).map(s -> s.length()).forEach(s -> System.out.println(s));


        List<Integer> integerList = List.of(0, 1, 3, 54, 1, 34, 56, 7);
        integerList.stream().forEach(i -> System.out.println(i));
        System.out.println("****");
        integerList.stream()
                .sorted()
                .distinct()
                .forEach(i -> System.out.println(i));
        System.out.println("****");
        integerList.stream()
                .map(i -> i * 3)
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.println(i));
        System.out.println("****");
        boolean match = integerList.stream()
                .map(i -> i * 3)
                .filter(i -> i % 2 == 0)
                .allMatch(i -> i > 0);
        System.out.println(match);

        integerList.stream()
                .map(i -> i % 2 == 0)
                .sorted()
                .forEach(i -> System.out.println(i));

    }
}
