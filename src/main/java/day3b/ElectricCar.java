package day3b;

public class ElectricCar extends Car implements ElectricVehicle {
    @Override
    public void charge() {
        System.out.println("charging car");
    }
}
