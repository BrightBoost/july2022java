package day3;

import java.util.function.Predicate;

public class VoorbeeldImplementatieLambda {
    public static void main(String[] args) {
        // string groter dan 5
        Predicate<String> p1 = s -> s.length() > 5;
        System.out.println("geert: " + p1.test("Geert"));
        doSomething(p1);

        Predicate<String> p2 = (s) -> s.equals("blabla");
        doSomething(p2);
        doSomething((s) -> s.startsWith("M"));

        // integer deelbaar door 2
        Predicate<Integer> p3 = (i) -> i % 2 == 0;
        System.out.println(p3.test(1));
    }

    public static void doSomething(Predicate<String> predicate) {
        System.out.println("in dosomething:" + predicate.test("blabla"));
    }


}

