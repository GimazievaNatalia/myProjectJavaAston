package org.example.gimazieva;

public class App2 {
    public static void main(String[] args) {
        checkNumber(10);
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
