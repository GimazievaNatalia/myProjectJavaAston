package org.example.gimazieva;

public class App5 {

    public static void isLeapYear(int year) {
        boolean isLeap = true;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(isLeap); // Год високосный
        } else {
            System.out.println(false); // Год не високосный
        }
    }
}