package day3b;

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
    }
}
