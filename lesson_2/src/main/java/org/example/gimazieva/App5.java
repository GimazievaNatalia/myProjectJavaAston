package org.example.gimazieva;
import java.util.Scanner;
public class App5 {
    public static void isLeapYear(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeap = true;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(isLeap); // Год високосный
        } else {
            System.out.println(false); // Год не високосный
        }
    }
    public static void main( String[] args ) {
        isLeapYear();
    }
}


// Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.