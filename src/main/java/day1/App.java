package day1;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car();
        Engine engine = new Engine();
        User user = new User();
        car1.setEngine(engine);;
        user.setCar(new Car());
        user.getCar().setEngine(engine);
        car1.setColor("purple");
        System.out.println(car1.getColor());

        // hp van auto van user aanpassen
        user.getCar().getEngine().setHp(100);
        System.out.println(user.getCar().getEngine().getHp());
        System.out.println(car1.getEngine().getHp());
        System.out.println(engine.getHp());

        engine = new Engine();

        // hp van engine aanpassen
        engine.setHp(200);
        System.out.println(user.getCar().getEngine().getHp());
        System.out.println(car1.getEngine().getHp());
        System.out.println(engine.getHp());
    }
}
