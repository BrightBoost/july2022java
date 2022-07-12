package day3;

import java.util.Arrays;

public class StreamExamples {
    public static void main(String[] args) {
        int[] ints = {1, 23, 4, 6, 2, 8};

        //enkel source + terminal operation
        long aantalInts = Arrays.stream(ints).count();
        System.out.println("aantal: " + aantalInts);

        //source + 1 intermediate + terminal operation
        //tel hoeveel getallen groter dan 10
        long aantalGroterDan10 = Arrays.stream(ints)
                .filter((i) -> i > 10)
                .count();
        System.out.println("aantal groter dan 10:" + aantalGroterDan10);

        // sorteer + print
        Arrays.stream(ints)
                .sorted()
                .forEach((i) -> System.out.println(i));

        // maak een stream + filter op getallen kleiner dan 10
        // + sorteer + print
        Arrays.stream(ints)
                .filter(i -> i <10)
                .sorted()
                .forEach(i -> System.out.println(i));

        String[] names = { "bob", "bo", "bas", "mo"};
        Arrays.stream(names)
                .filter(s -> s.startsWith("b"))
                .sorted()
                .forEach(s -> System.out.println(s));

        // maak een stream van fruitsoorten
        // filter op meer dan 5 letters
        // sorteer
        //  limiteer naar 2 met de limit(2) methode
        // print de fruitsoorten
        String[] fruits = { "grapefruit", "lemon", "grapes", "kiwiwi", "gappel" };
        Arrays.stream(fruits)
                .filter(fruit -> fruit.length() > 5)
                .sorted()
                .limit(2)
                .forEach(fruit -> System.out.println(fruit));

        // maak een stream van fruitsoorten
        // filter op begint met * insert letter die je hebt*
        // skip er 1 .skip(1)
        // sorteer
        // print
        System.out.println("xxxxx§");
        Arrays.stream(fruits)
                .filter(fruit -> fruit.startsWith("g"))
                .skip(1)
                .sorted()
                .forEach(i -> System.out.println(i));

    }
}
