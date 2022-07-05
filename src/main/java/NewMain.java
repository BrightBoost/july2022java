public class NewMain {
    public static void main(String[] args) {
        ElectricalScooter v = new ElectricalScooter();
        int x = 3;
        v.setAantalWielen(2);
        v.sayVroom();
        v.sayVroom("zjoef", 3);
        int d = 1_000_000_000;
        System.out.println(d);

        Car geertsCar = new Car();
        geertsCar.autoPark();
        String locatie = geertsCar.getCurrentLocation();
        System.out.println(locatie);
    }
}
