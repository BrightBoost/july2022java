package day4;

import day1.Car;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Exceptional {
    public static void main(String[] args) {
        read("./blabla.txt");
        try {
            doSomething();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void doSomething() throws SQLException {
        throw new SQLException("Oh nee een SQL fout");
    }

    public static void read(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
                // met deze regel aan kom je in IO exception block
                // fr.close();
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Oh nee! Ik kan m niet vinden");
        } catch (IOException e) {
            System.out.println("Oh nee! Iets ging mis. Do something!");
        }

        // try with resources
        try(FileReader fr = new FileReader(fileName)) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
                // met deze regel aan kom je in IO exception block
                // fr.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Oh nee! Ik kan m niet vinden");
        } catch (IOException e) {
            System.out.println("Oh nee! Iets ging mis. Do something!");
        }

    }
}
