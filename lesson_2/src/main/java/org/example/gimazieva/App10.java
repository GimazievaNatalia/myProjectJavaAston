package org.example.gimazieva;

import java.util.Arrays;
public class App10 {

    public static void arrayInitializer(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);

        for (int value : array) {
            System.out.print(value);
        }
    }
}