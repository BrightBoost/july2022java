package day3b;

public class ElectricBoat extends Boat implements ElectricVehicle {
    @Override
    public void charge() {
        System.out.println("charging boat");
    }

}
