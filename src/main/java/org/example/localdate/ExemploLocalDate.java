package org.example.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class ExemploLocalDate {

    public static void main(String[] args) {

        LocalDateTime data  = LocalDateTime.now();
        System.out.println(data.getDayOfWeek().name());
        System.out.println(data.getMonthValue());
        System.out.println(data.getMonth());
        System.out.println(data.getYear());
        System.out.println(data.getHour());
        System.out.println(data.getMinute());
        System.out.println(data.getSecond());

        LocalDate outraData = LocalDate.of(2025, Month.MARCH, 10);
        System.out.println(outraData);
        System.out.println(outraData.isLeapYear());
        System.out.println(outraData.lengthOfMonth());


    }
}
