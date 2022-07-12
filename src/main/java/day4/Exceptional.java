package day4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptional {
    public static void main(String[] args) {
        read("./blabla.txt");
    }

    public static void read(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Oh nee! Ik kan m niet vinden");
        } catch (IOException e) {
            System.out.println("Oh nee! Iets ging mis. Do something!");
        }

    }
}
