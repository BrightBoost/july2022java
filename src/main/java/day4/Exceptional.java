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

        badExample(3, 0);

    }

    public static void doSomething() throws SQLException {
        throw new SQLException("Oh nee een SQL fout");
    }

    public static void badExample(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static void betterExample(int a, int b) {
        if(b == 0) {
            System.out.println("Cannot divide by 0");
        } else {
            System.out.println(a / b);
        }
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
