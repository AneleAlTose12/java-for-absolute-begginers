package com.aneal.bgn.ch5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * The java.util.Date class and the java.text.SimpleDateFormat class are not
 * thread safe, so in complex applications with multiple execution threads, developers
 * must synchronize access to those type of objects explicitly. Objects of those types are not
 * immutable, and working with time zones is a pain. That is why in Java 8, a new API to
 * model calendar-date operations was introduced. It is better designed, and date instances
 * are thread-safe and immutable. The central classes for the API are java.time.LocalDate
 * and java.time.LocalDateTime, used to model calendar dates and calendar dates with
 * time. Let’s see how the code to get the current date and to create a custom date looks
 * with the new API.
 */
public class CalenderDateDemo03 {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);
        LocalDate today = currentTime.toLocalDate();
        System.out.println("Today: " + today);

        LocalDate johnBd = LocalDate.of(1977, Month.OCTOBER, 16);
        System.out.println("John's Birthday: " + johnBd);

        int day = johnBd.getDayOfMonth();
        System.out.println("Day: " + day + ", " + johnBd.getDayOfWeek());
        int month = johnBd.getMonthValue();
        System.out.println("Month: " + month + ", " + johnBd.getMonth());
        int year = johnBd.getYear();
        System.out.println("Year: " + year);
    }
    /**
     * To create a custom date, the actual year and day of month can be used as parameters
     * and the month can be specified using one of the values of the java.time.Month enum.
     * Extracting information regarding a date can be done easily by calling methods with
     * intuitive names.
     */
}
