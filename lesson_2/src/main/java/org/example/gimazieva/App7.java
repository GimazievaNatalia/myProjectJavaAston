package org.example.gimazieva;
public class App7 {

    public static void fillArrayNumbers() {
        int[] numbers = new int[100];
        int i = 1;
        for (int number : numbers) {
            number = i++;
            System.out.println(number);
        }
    }
}