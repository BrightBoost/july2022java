import java.time.LocalDate;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
        String name = "Geert";
        User user1 = new User();
        User user3;
        user1.userName = "miranda123";
        user1.firstName = "Miranda";
        user1.blocked = false;
        Address address = new Address();
        user1.address = address;
        user1.address.zipcode = "1234ab";
        User user2 = new User();
        user2.userName = "Hub123";
        System.out.println("Hoi " + user1.userName);
    }
}
