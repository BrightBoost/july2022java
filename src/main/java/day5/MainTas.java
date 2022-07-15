package day5;

import java.util.List;

public class MainTas {
    public static void main(String[] args) {
        //tas voor chihuahua
        Chihuahua chihuahua = new Chihuahua();
        chihuahua.setNaam("Brutus");

        Tas<Chihuahua> brutusTas = new Tas<>();
        brutusTas.setInhoudTas(chihuahua);

        // tas voor laptop
        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");

        Tas<Laptop> laptopTas = new Tas<>();
        laptopTas.setInhoudTas(laptop);

        // boodschappentas
        Boodschappen boodschappen = new Boodschappen();
        List<String> stringList = List.of("eieren", "melk, bloem");
        boodschappen.setBoodschappenLijst(stringList);

        Tas<Boodschappen> boodschappenTas = new Tas<>();
        boodschappenTas.setInhoudTas(boodschappen);

        // tas voor strings
        Tas<String> stringTas = new Tas<>();
        stringTas.setInhoudTas("blabla");
    }
}
