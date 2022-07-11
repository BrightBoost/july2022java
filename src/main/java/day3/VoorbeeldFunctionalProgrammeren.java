package day3;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VoorbeeldFunctionalProgrammeren {
    public static void main(String[] args) {
        Consumer<String> c1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> c2 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hoi " + s);
            }


        };

        Predicate<String> p1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.startsWith("M")){
                    return true;
                } else {
                    return false;
                }
            }
        };

        String[] names = {"Geert", "Miranda", "Hub", "Xandra", "Rik", "Maaike"};
        Arrays.stream(names).forEach(c2);
        long aantalNamen = Arrays.stream(names).filter(p1).count();
        System.out.println(aantalNamen);

        TestNameStartsWithM t = new TestNameStartsWithM();
        System.out.println(t.test("Rik"));
        System.out.println(p1.test("Miranda"));
    }
}
