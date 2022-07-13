package day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        LocalDate newDate = vandaag.plusDays(4);
        System.out.println("vandaag: " + vandaag);
        System.out.println("new: " + newDate);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dtf.format(vandaag));

        LocalDate datum = LocalDate.of(2022, 4, 2);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf2.format(lt));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(dtf2.format(ldt));
        System.out.println(ldt.format(dtf2));
    }
}
