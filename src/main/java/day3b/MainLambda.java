package day3b;

import java.util.Locale;

public class MainLambda {
    public static void main(String[] args) {
        Calculator c1 = (a, b) -> a + b;

        Calculator c1b = new Calculator() {
            @Override
            public double calc(double a, double b) {
                return a + b;
            }
        };

        Calculator c2 = (x, y) -> x * y;

        Calculator c3 = (x, y) -> x - y;

        double result1 = c1.calc(5, 6);
        System.out.println(result1);

        double result2 = c2.calc(2, 3);
        System.out.println(result2);

        double result3 = c3.calc(1, 2);
        System.out.println(result3);

        Printer p = s -> System.out.println(s);
        p.print("Hoi!!");

        Printer p2 = s -> System.out.println("result:" + s);
        p2.print("Hoi!!");

        doSomething(p2);
        calcSomething(c1, 4, 5);
        calcSomething(c2, 3, 4);
        calcSomething(c3, 6, 7);

        String s = "blabla";
        System.out.println(s.toLowerCase().getBytes()[0] - 96);
    }

    public static void doSomething(Printer printer) {
        printer.print("Do something");
    }

    public static void calcSomething(Calculator calculator, double x, double y) {
        System.out.println(calculator.calc(x, y));
    }
}
