package day5;

import day2.sub.A;

import java.util.ArrayList;
import java.util.List;

public class Voorbeeld {
    public static void main(String[] args) {
        List<Chihuahua> chihuahuaList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        List<? extends Dog> dogs = dogList;
        dogList.addAll(chihuahuaList);
        Chihuahua c = new Chihuahua();
        Dog d = new Dog();
        chihuahuaList.add(c);

    }
}
