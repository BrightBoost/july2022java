package day3b;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
        ElectricVehicle electricVehicle = new ElectricBoat();

        //anonymous implementation
        ElectricVehicle electricVehicle1 = new ElectricVehicle() {
            @Override
            public void charge() {
                System.out.println("anonieme implementatie laadt op");
            }
        };

        electricVehicle1.charge();

        // kort geschreven anonieme implementatie: lambda expressie
        ElectricVehicle ev = () -> System.out.println("lambda implementatie laadt op");


    }
}
