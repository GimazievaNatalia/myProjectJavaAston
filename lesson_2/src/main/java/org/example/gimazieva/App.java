package org.example.gimazieva;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        checkAmount();
    }

    public static void checkAmount() {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1 + number2 > 10 && number1 + number2 < 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}