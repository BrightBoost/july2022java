package day3b;

import java.util.Arrays;
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


    }
}
