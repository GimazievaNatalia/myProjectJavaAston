package org.example.gimazieva;

public class App4 {
    public static void main(String[] args) {
        printMyText("Hello world", 2);
    }

    public static void printMyText(String str, int number) {
        int counter = 1;
        while (counter <= number) {
            System.out.println(str);
            counter++;
        }
    }
}