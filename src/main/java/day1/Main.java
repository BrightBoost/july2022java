package day1;

public class Main {
    public static void main(String[] args) {
        String name = "Geert";
        User user1 = new User();
        User user3;
        user1.setUserName("miranda123");
        user1.setFirstName("Miranda");
        user1.setBlocked(false);
        Address address = new Address();
        user1.setAddress(address);
        user1.getAddress().setZipcode("1234ab");
        User user2 = new User();
        user2.setUserName("Hub123");
        System.out.println("Hoi " + user1.getUserName());
        Car car1 = new Car();
        String s = "123";
        car1.setNumberplate(s);
        car1.setEngine(new Engine());
        user1.setCar(car1);
        user1.getCar().getEngine().setHp(100);
    }
}
