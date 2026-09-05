package com.tpointtech.java8features;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {
    static void main() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
        LocalDate future = today.plusDays(4);
        System.out.println("Date after 4 days: " + future);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd*MM*yyyy");
        String f1 = today.format(formatter);
        System.out.println("Formatted date: " + f1);

        String f2 = future.format(formatter);
        System.out.println("Formatted date after 4 days: " + f2);
    }
}
