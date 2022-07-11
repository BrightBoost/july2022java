package day3;

import java.util.function.Predicate;

public class TestNameStartsWithM implements Predicate<String> {

    @Override
    public boolean test(String s) {
        if(s.startsWith("M")){
            return true;
        } else {
            return false;
        }
    }
}
