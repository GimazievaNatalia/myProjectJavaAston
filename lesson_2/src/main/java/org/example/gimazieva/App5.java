package org.example.gimazieva;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        isLeapYear();
    }
    public static void isLeapYear() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeap = true;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(isLeap); // Год високосный
        } else {
            System.out.println(false); // Год не високосный
        }
    }
}